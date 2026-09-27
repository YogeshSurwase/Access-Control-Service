package com.yog.access_control.service;

import org.springframework.http.ResponseEntity;

import com.yog.access_control.entity.UsersEntity;

public interface UserService {

	ResponseEntity<?> addUser(UsersEntity user);

}
