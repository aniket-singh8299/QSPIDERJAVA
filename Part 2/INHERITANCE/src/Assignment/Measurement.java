package Assignment;

public class Measurement {
float l=5.6f;
float w=8.2f;


}

class Rectangle extends Measurement{
	public void area() {
		System.out.println("Rectangle is "+(l*w));
	}
	public void Perimeter() {
		System.out.println("Perimeter is "+(2*(l+w)));
	}
	
}

class Mainsssss{
	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		 a.Perimeter();
		 a.area();
		 
		
		
		 
		 
		
	}
}
