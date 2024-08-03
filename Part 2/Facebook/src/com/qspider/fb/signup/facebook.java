package com.qspider.fb.signup;

public class facebook {

private String name;
private int id;
private String password;

public String getUserName() {
	return name;
}
public void setUserName(String name) {
	this.name=name;
}
public int getUserId() {
	return id;
}
public void setPassword (String password) {
	this.password=password;
}
public facebook(String name,int id,String password) {
	this.name=name;
	this.id=id;
	this.password=password;
}
}
