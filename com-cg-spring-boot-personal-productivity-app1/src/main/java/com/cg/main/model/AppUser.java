package com.cg.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "app_users")
public class AppUser {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="user_id")
private Integer userId;
@Column(name ="user_name")
private String userName;
@Column(name="mob_num")
private Long mobileNumber;
@Column(name= "pass")
private String password;
@OneToMany(cascade = CascadeType.ALL)
private List<Task> TaskList;


public List<Task> getTaskList() {
	return TaskList;
}

public void setTaskList(List<Task> taskList) {
	TaskList = taskList;
	
}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Long getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
