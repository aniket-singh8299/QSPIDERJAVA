
public class Exc {
//	public void m() {
//		System.out.println("Aniksdn");
//	}
	
 public static void main(String[] args) {
	 

	 try {
		 System.out.println(43/0);
	 }
	 catch(ArithmeticException e) {
		 System.out.println("ERROR");
		 System.out.println(e.getMessage());
	 }
	 
//	 

	 String s="ANiket";
	 try {
		 System.out.println(s.charAt(8));
	 }
	 catch(StringIndexOutOfBoundsException d) {
		 System.out.println(d.getMessage());

	 }
//	 
	 
	 
	 int[] age = {12, 4, 5, 2, 5};
	 try {
		 System.out.println(age[7]);
	 }
	 catch(ArrayIndexOutOfBoundsException a) {
		 System.out.println(a.getMessage());
//		 a.printStackTrace();

		 
	 }
	 
//	 
A n=null;
 
	 try {
		 n.add();

	 }
	 catch(NullPointerException f) {
		 System.out.println(f.getMessage());
	 }
	 
	 
//	 //	 
	 
	 
	 


//	 Exc g=new Exc();
//	 CastException e=(CastException)g;
//	 e.m();
	 
	 
 }

 


 
 
 
}

//class CastException extends Exc{
//	public void m() {
//		System.out.println("A");
//	}
//}
class A{
	public void add() {
		System.out.print("ADD");
	}
}

