package abs;

class Child implements Abstract{
	void m() {
		System.out.println("Hello, Aniket");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.m();
	}
}