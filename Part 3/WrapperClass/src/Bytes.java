
public class Bytes {
public static void main(String[] args) throws NumberFormatException  {
//	Byte b=12;
//	System.out.println(b);
//	Short s=12;
//	System.out.println(s);
//
//	Integer i=23;
//	System.out.println(i);
//
//	Long l=123l;
//	System.out.println(l);
//
//	Float f=12.1f;
//	System.out.println(f);
//
//	Double d=123d;
//	System.out.println(d);
//
//	Boolean ba=true;
//	System.out.println(ba);
//
//	Character c='A';
//	System.out.println(c);
//	
//	
//Byte b=new Byte(12);
//	System.out.println(b);
//
//	
//Short s=new Short(12);
//	System.out.println(s);

//	Integer i=new Integer(123);
//	System.out.println(i);
//	
//Long l=new Long(82392);
//System.out.println(l);
//
//Float f=new Float(23.2f);
//System.out.println(f);
//
//Double d=new Double(2323.1d);
//System.out.println(d);
//
//Boolean b=new Boolean(true);
//System.out.println(b);
	
	//Auto boxing
//	Integer i=6;
//	int a=i;
//	
//	System.out.println(a);
//	
//	Byte b=12;
//	byte y=b;
//	System.out.println(y);
//
//	
//	
//	Short s=12;
//	short m=s;
//	System.out.println(m);
//	
//	
//	Long l=12l;
//	long aa=l;
//	System.out.println(aa);
//	
//	
//	
//
//	
//	
//
//	
//	
//	
//	
//	
//	
//
//
//
//
//



	
//Dog d=new Dog();
//d.fetch();
//	
	
String s="Tr";
Boolean f=Boolean.parseBoolean(s);
System.out.println(s+3);
System.out.println(f);


	String l="Aniket Kumar ";
	String a=l.concat("Singh");
	System.out.println(a);
	
	StringBuffer m=new StringBuffer("Aniket");
	m=m.append("Kumar");
	System.out.println(m);
	
	
	
	

	
}
}

class Animal{
	public  void sound() {
		System.out.println("Animal");
		
	
}




}


class Dog extends Animal{
	public void sound() {
		System.out.println("Doge");
	}
	void fetch() {
		super.sound();
	}
	
}
