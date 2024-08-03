package Inheritancetypes;

public class ParentH {
  void parentm() {
	  System.out.println("Parent");
  }
}
class child12 extends ParentH{
	public void dchild12() {
		System.out.println("child12");
	}
}
class child123 extends ParentH{
	public void dchild13() {
		System.out.println("child13");
	}
}

class Mains {
    public static void main(String[] args) {
        child12 child1 = new child12();
        child123 child2 = new child123();
        child1.parentm();
        child1.dchild12();
        child2.parentm();
        child2.dchild13();
    }
}
