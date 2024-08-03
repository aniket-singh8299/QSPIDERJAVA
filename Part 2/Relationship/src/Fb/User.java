package Fb;

public class User {
String Username;
int id;
int password;
public User(String Username,int id,int password) {
	this.Username=Username;
	this.id=id;
	this.password=password;
}
public void printdetails() {
	System.out.println(Username);
	System.out.println(id);
	System.out.println(password);

	
}
}
