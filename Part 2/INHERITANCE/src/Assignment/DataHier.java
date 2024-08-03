package Assignment;

public class DataHier {
int n1=5;
int n2=6;
}

class Sumsub extends DataHier{
	public void sum() {
		System.out.println("Sum of Two Number:"+(n1+n2));
		
	}
	public void sub() {
		System.out.println("Subract of Two Number:"+(n1-n2));
		
	}


}

class Multidiv extends DataHier{
	public void Multi() {
		System.out.println("Sum of Two Number:"+(n1*n2));
		
	}
	public void Divs() {
		System.out.println("Subract of Two Number:"+(n1/n2));
		
	}

	
	
}


class Mainssss{
	public static void main(String[] args) {
		Sumsub a=new Sumsub();
		 a.sum();
		 a.sub();
		 
		 Multidiv aa=new Multidiv();
		 aa.Multi();
		 aa.Divs();
		 
		
		 
		 
		
	}
}





