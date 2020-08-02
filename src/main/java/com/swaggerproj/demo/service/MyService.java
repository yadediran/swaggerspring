package com.swaggerproj.demo.service;



import com.swaggerproj.demo.model.UserSet;


import java.util.List;
import java.util.Optional;

public interface MyService {

	List<UserSet> getUsersFromService();

	Optional<UserSet> getUserByIdFromService(int id);

}

