package com.yog.access_control.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yog.access_control.entity.UsersEntity;
import com.yog.access_control.repository.UserRepository;
import com.yog.access_control.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public ResponseEntity<?> addUser(UsersEntity user) {
		UsersEntity savedUser =  userRepository.save(user);
		return new ResponseEntity(savedUser, HttpStatus.CREATED);
	}

}
