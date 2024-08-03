package Assignment;

public class Number {
int n1=5;
int n2=7;

}
class Calculator extends Number{
	public void sum() {
		System.out.println("Sum of Two Number is "+(n1+n2));
	}
	public void sub() {
		System.out.println("Subratct is "+(n1-n2));
	}
	public void mul() {
		System.out.println("Multiply of Two Number is "+(n1*n2));
	}
	
}
class Mainnsss{
public static void main(String[] args) {
	Calculator c=new Calculator();
	c.sum();
	c.sub();
	c.mul();
	
	
}}