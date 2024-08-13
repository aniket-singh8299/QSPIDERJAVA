package cast;

public class Upcasting {
	 public void print() {
	    	System.out.println("parent");
	    }
		

	}
	class Up extends Upcasting{
		public void print() {
			System.out.println("chid");
			
			
		}
	}

	class Main{
		public static void main(String[] args) {
			Upcasting d=new Up();
			
			
			d.print();

		}
		
}
