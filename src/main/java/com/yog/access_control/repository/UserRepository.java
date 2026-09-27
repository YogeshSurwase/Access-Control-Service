package com.yog.access_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yog.access_control.entity.UsersEntity;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Long> {
	

}
