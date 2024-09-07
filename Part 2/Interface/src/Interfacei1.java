
public interface Interfacei1 {
	public static void in() {
		
	}
}

interface Interface2 extends Interfacei1{
	public void m1() ;

//class Interface3 extends Interface2{
//	static void Inter() {
//		System.out.println("Interface3");
//	}
//}
}

class Interface3 implements Interface2{

	
	public void m1() {
		System.out.println("Interface3");
		
	}
	
}

class Main{
	public static void main(String[] args) {
		Interface3 i3=new Interface3();
		i3.m1();
		
		
		
		
	}
}
