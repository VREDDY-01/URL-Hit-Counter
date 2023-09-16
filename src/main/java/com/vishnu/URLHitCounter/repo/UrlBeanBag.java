package com.vishnu.URLHitCounter.repo;

import com.vishnu.URLHitCounter.entities.User;
import com.vishnu.URLHitCounter.entities.Visitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UrlBeanBag {
	@Bean
	public List<User> getUserList(){
		return new ArrayList<>();
	}

	@Bean
	public Visitor getVisitorsObject(){
		return new Visitor(0);
	}
}
