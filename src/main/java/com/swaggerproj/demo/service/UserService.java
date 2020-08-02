package com.swaggerproj.demo.service;

import java.util.List;
import java.util.Optional;


import com.swaggerproj.demo.dao.UserDao;
import com.swaggerproj.demo.model.UserSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService implements MyService {

	@Autowired
	UserDao dao;

	@Override
	public List<UserSet> getUsersFromService() {
		return dao.getUsersFromDao();
	}
	@Override
	public Optional<UserSet> getUserByIdFromService(int id) {
		return dao.getUserByIdFromDb(id);
	}
}