import java.util.ArrayList;

public class Student {
	int roll;
	String s;
	

	public Student(int roll, String s) {
		super();
		this.roll = roll;
		this.s = s;
	}
	


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", s=" + s + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> s=new ArrayList();
		Student s2=new Student(1,"Aniket");
		Student s1=new Student(2,"Varun");
		s.add(s2);
		s.add(s1);
		
		
		for(Student p:s) {
			System.out.println(s2);
		}
		
		

	}

}
