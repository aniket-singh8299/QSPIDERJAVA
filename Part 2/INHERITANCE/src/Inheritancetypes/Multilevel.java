package Inheritancetypes;

public class Multilevel {
		void parentMethod() {
	        System.out.println("This is the parent method.");
	    }
	}

	class Child extends Multilevel {
	    void childMethod() {
	        System.out.println("This is the child method.");
	    }
	}

	 class child1 extends Child{
		
		void child1Method() {
			System.out.println("This is the child1 method.");
	}
	
	class Main {
	    public static void main(String[] args) {
	        child1 child = new child1();
	        child.parentMethod();
	        child.childMethod();
	    }
	}

}
