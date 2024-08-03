package Assignment;

public class College {
String Cname="Lingayas Vidyapeeth";
String name="Aniket Kumar Singh";
String Branch="Btech Cse";
}

class Interval extends College{
	int mark1=100;
	int mark2=200;
}

class Semester extends Interval{
	
		int sum=mark1+mark2;
		
		
	
	public void displayDetails() {
		System.out.println("My Name is  "+name);
		System.out.println("College Name is  "+Cname);
		System.out.println("Branch is  "+Branch);
		System.out.println("Summation of mark is  "+sum);
		
		
	}
	
}

class Main{
	public static void main(String[] args) {
		Semester s=new Semester();
		s.displayDetails();
		
	}
}





