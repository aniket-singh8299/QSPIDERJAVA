package Inheritancetypes;

public class Parent {
	void parentMethod() {
        System.out.println("This is the parent method.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is the child method.");
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
    }
}

