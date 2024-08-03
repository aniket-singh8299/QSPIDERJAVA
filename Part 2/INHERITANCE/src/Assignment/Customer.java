package Assignment;

public class Customer {
int p=12;
int r=23;
int t=2;
}
class SIcalculator extends Customer{
	public void SI() {
		int si=(p*r*t)/100;
		System.out.println("Simple Interest:"+si);
	}
	
}

class Mainss{
	public static void main(String[] args) {
		SIcalculator ss=new SIcalculator();
		 ss.SI();
		
	}
}


