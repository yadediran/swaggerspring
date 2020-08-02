package com.swaggerproj.demo.dao;






import com.swaggerproj.demo.model.UserSet;

import java.util.List;
import java.util.Optional;
public interface UserDao {

	List<UserSet> getUsersFromDao();
	Optional<UserSet> getUserByIdFromDb(int id);

}
