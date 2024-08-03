package OLAS;

public class Bike {
String Bike_name="NINJA";
String Bike_no="HR34 SD1234";
String Bike_model="2024";

public void getBikeDetails() {
	System.out.println(Bike_name);
	System.out.println(Bike_no);
	System.out.println(Bike_model);


}
public void setBikeData(String Bike_name,String Bike_no,String Bike_model) {
	this.Bike_name=Bike_name;
	this.Bike_no=Bike_no;
	this.Bike_model=Bike_model;
}


}
