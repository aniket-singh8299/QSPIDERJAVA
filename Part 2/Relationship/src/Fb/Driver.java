package Fb;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Facebook f=new Facebook(123,"Facebook",new User("ANIKET",12,7));
System.out.println(f.cid);
f.u.printdetails();
	}

}
