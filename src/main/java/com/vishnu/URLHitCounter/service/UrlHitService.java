package com.vishnu.URLHitCounter.service;

import com.vishnu.URLHitCounter.entities.User;
import com.vishnu.URLHitCounter.entities.Visitor;
import com.vishnu.URLHitCounter.repo.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
	@Autowired
	UrlHitRepo urlHitRepo;

	public User getUrlHitCount(String username) {
		for (User user : urlHitRepo.getUserList()) {
			if (user.getUsername().equals(username)){
				//Increase the count for user
				Integer userCount = user.getHitcount();
				user.setHitcount(userCount+1);
				//Increase total visitors count ( OPTIONAL )
				/*Integer visitors = urlHitRepo.getVisitorObject().getVisitors();
				urlHitRepo.getVisitorObject().setVisitors(visitors+1);*/
				return user;
			}
		}
		return new User("user not found with username: "+username,0);
	}

	public String addUser(User user) {
		urlHitRepo.getUserList().add(user);
		return "added 1 user";
	}

	public Visitor getCount() {
		Integer visitors = urlHitRepo.getVisitorObject().getVisitors();
		urlHitRepo.getVisitorObject().setVisitors(visitors+1);
		return urlHitRepo.getVisitorObject();
	}
}
