package obj;

public class Student {

	String name;
    int age;
    String id;
    String course;
    double gpa;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Aniket");
        Student student3 = new Student("KUNAL", 20);
        Student student4 = new Student("MOHAN", 20, "S123");
        Student student5 = new Student("RAHUL", 20, "S123", "Computer Science", 3.9);
    }

    // Constructor 1
    Student() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Student(String name) {
        System.out.println("Name: " + name);
    }

    // Constructor 3
    Student(String name, int age) {
        
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Constructor 4
    Student(String name, int age, String id) {
        
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }

    // Constructor 5
    Student(String name, int age, String id, String course, double gpa) {
        
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id + ", Course: " + course + ", GPA: " + gpa);
    }

}
