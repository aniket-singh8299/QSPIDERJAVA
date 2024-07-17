class IncDec{

public static void main(String[] args)

{

int a=10;
int b=20;


System.out.println(a++);
System.out.println(b--);
System.out.println(++a);
System.out.println(--b);
System.out.println(++a + ++a);
System.out.println(--a + --b + a++ + b++ + "java");


//Even or Odd


int num=18;

String res=(num%2==0)? "Even" : "ODD";
System.out.println("Number is  "+res);

//Larger of two numbers

int a1=18;
int b1=11;


int resl=(a>b)? a :b;
System.out.println("Largest Number is  "+resl);










}



}