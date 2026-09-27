package com.yog.access_control.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_hdr")
public class UsersEntity{
	
	@Id
	@Column(name = "usr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long usrId;
	
	@Column
	private String usrName;
	
	@Column
	private String usrPassword;
	
	@Column
	private Boolean isActive;
	
}
