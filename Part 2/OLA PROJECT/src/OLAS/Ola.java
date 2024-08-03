package OLAS;

public class Ola {
Driver d;
Bike b;
User u;
Auto a;
Car c;

public void Olas(Driver d,Bike b,User u,Auto a,Car c) {
	this.d=d;
	this.b=b;
	this.u=u;
	this.a=a;
	this.c=c;
}
public void addBike(Bike b) {
	this.b=b;
	
	

}
public void addUser(User u) {
    this.u=u;
	System.out.println("User is Added");

    
}   
public void addAuto(Auto a) {
	this.a=a;
	
}

public void addCar(Car c) {
	this.c=c;
	
}
public void addDriver(Driver d) {
	this.d=d;
	
}


       
	
}

