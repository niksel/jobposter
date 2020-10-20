package com.nikhil.jobpost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nikhil.jobpost.dao.UserRepository;
import com.nikhil.jobpost.dto.User;
import com.nikhil.jobpost.entity.UserEntity;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		
		UserEntity userEntity = new UserEntity(user.getUserId(), user.getName(), user.getEmail(), 
				user.getPassword(), user.getPhone(), user.getAddress());
		
		userRepository.save(userEntity);
		
		return user;
		
	}

}
