package cast;

public class InstanceOf {
  void as() {
	  System.out.println("Parent");
  }
}

class Child extends InstanceOf{
	void as() {
		System.out.println("Child");
	}
}

class Mainsss{
	public static void main(String[] args) {
		
		InstanceOf i=new Child();

	
		if (i instanceof Child) {
			 Child c =(Child) i;
			 }
		i.as();
		i.as();
		
}
}
