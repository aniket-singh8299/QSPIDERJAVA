package cast;

public class Downcasting {
     void a() {
    	 System.out.println("Parent");
     }
     

}

class  Down extends Downcasting{
	void a() {
		System.out.println("child");
	}
}

class Mains{
	public static void main(String[] args) {
		Downcasting ds=new Down();
//		Down da=new Downcasting();
		Down d=(Down)ds;
		d.a();
		ds.a();
	}
}