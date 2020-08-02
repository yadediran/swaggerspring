package com.swaggerproj.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import com.swaggerproj.demo.model.UserSet;
import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;

@Repository
public class UserDb2Dao implements UserDao {

	// User, or Person list.
	static List<UserSet> users;



	static {
		users = new ArrayList<>();

		// To generate the anonymised identity for users
		Faker faker = new Faker();

		// Creating anonymised (or artificial) user data for testing
		for(int num =1; num <20; num++){
		UserSet person = new UserSet();
		// Adding users, peoples or persons records to the list.
			person.setId(num);
			person.setName(faker.name().fullName());
			person.setMobile(faker.phoneNumber().cellPhone());
			person.setAddress(faker.address().streetAddress()); /*location*/
			person.setEmailAddress(faker.internet().emailAddress());
			users.add(person);


		}

	}

	@Override
	public List<UserSet> getUsersFromDao() {
		return users;
	}

	@Override
	public Optional<UserSet> getUserByIdFromDb(int id) {
		return users.stream().filter((users) -> users.getId() == id).findFirst();
	}
}