package OLAS;

public class User {
String name="ANIKET";
int Number=82993;
int age=24;

public void printdetails() {
	System.out.println(name);
	System.out.println(Number);
	System.out.println(age);

}
public void setuserDetails(String name,int Number,int age) {
	this.name=name;
	this.Number=Number;
	this.age=age;
}


}
