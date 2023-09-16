package com.vishnu.URLHitCounter.repo;

import com.vishnu.URLHitCounter.entities.User;
import com.vishnu.URLHitCounter.entities.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepo {
	@Autowired
	private List<User> userList;
	@Autowired
	private Visitor visitorObject;

	public List<User> getUserList() {
		return userList;
	}

	public Visitor getVisitorObject() {
		return visitorObject;
	}
}
