package Assignment;

public class Data {
int n1=7;
int n2=9;

}
class AddSubCal extends Data{
	public void sum() {
		System.out.println("Sum of Two Number:"+(n1+n2));
		
	}
	public void sub() {
		System.out.println("Subract of Two Number:"+(n1-n2));
		
	}
}
class MulDivCal extends Data{
	public void Multi() {
		System.out.println("Multiply of Two Number:"+(n1*n2));
		
	}
	public void Div() {
		System.out.println("Division of Two Number:"+(n1/n2));
		
	}
}
class Average extends Data{
	public void Averages() {
		System.out.println("Average :"+((n1+n2)/2));
	}
}

class Mainsss{
	public static void main(String[] args) {
		AddSubCal a=new AddSubCal();
		 a.sum();
		 a.sub();
		 
		 MulDivCal aa=new MulDivCal();
		 aa.Multi();
		 aa.Div();
		 
		 Average aaa=new Average();
		 aaa.Averages();
		 
		 
		
	}
}


 