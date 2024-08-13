
interface Interfacewithabstract {
    
	//we can achieve 100% abstraction by using interface
	//we cannot define constructor
	
	public static final int a=10;//we should take public static final and initialization
	//by default all method is public 
	//we can take static,public,final it is optional but by default it is s,p,f
	int b=10;
	void m1();//abstract methods
	
 default void  m2() {
		//we can use static method in interface
	 //we can define non static concrete method if it is access modifier is default with default keyword.
		
		
		
	}
	static void main(String[] args) {
		//we can remove public from main method because it is by default it is public 
		
	}
	
	
	//predefined interface
	//divide in 3 phase
	//1)Regular(more than one abstract method)  2) Functional(only one)  3) Marker(empty)
	
	
}



