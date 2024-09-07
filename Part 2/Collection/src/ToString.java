
public class ToString {
	
	String name;
	int number;
	public ToString(String name,int number) {
		this.name=name;
		this.number=number;
		
	}
    
	public String toString() {
		return name+" "+number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ToString s=new ToString("Aniket",8299);
		
		System.out.println(s.toString());
		

	}

}
