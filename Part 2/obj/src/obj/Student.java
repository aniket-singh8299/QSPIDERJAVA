package obj;

public class Student {
private String name;
private int id;
private String gender;
private String course;
private String address;
private int password;
public Student(String name,int id,String gender, String course,String address, int password) {
	this.name=name;
	this.id=id;
	this.gender=gender;
	this.course=course;
	this.address=address;
	this.password=password;
	
	
}

public void readname() {
	System.out.println(name);
	
}
public void writename(String name) {
	this.name=name;
}

public void readid() {
	System.out.println(id);
}
public void readgender() {
	System.out.println(gender);
}
 
public void readcourse() {
	System.out.println(course);
}
public void writecourse(String course) {
	this.course=course;
}

public void readaddress() {
	System.out.println(address);
}
public void writeaddress(String address) {
	this.address=address;
	}
public void writepassword(int password){
	this.password=password;
}


}
