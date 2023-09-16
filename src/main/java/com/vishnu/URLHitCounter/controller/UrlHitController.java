package com.vishnu.URLHitCounter.controller;

import com.vishnu.URLHitCounter.entities.User;
import com.vishnu.URLHitCounter.entities.Visitor;
import com.vishnu.URLHitCounter.service.UrlHitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UrlHitController {
	@Autowired
	UrlHitService urlHitService;

	@GetMapping("api/v1/visitor-count-app/username/{username}/count")
	public User getUrlHitCount(@PathVariable @Valid String username){
		return urlHitService.getUrlHitCount(username);
	}

	@GetMapping("count")
	public Visitor getCount(){
		return urlHitService.getCount();
	}

	@PostMapping("api/v1visitor-count-app/user")
	public String postUser(@RequestBody @Valid User user){
		return urlHitService.addUser(user);
	}


}
