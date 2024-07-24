public class {
    String name;
    int age;
    String id;
    String course;
    double gpa;

    // Constructor 1
    Student() {}

    // Constructor 2
    Student(String name) {
        this.name = name;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 4
    Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Constructor 5
    Student(String name, int age, String id, String course, double gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.course = course;
        this.gpa = gpa;
    }
}

class Employee {
    String name;
    int age;
    String id;
    String department;
    double salary;

    // Constructor 1
    Employee() {}

    // Constructor 2
    Employee(String name) {
        this.name = name;
    }

    // Constructor 3
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 4
    Employee(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Constructor 5
    Employee(String name, int age, String id, String department, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
}

class Customer {
    String name;
    int age;
    String id;
    String address;
    String phoneNumber;

    // Constructor 1
    Customer() {}

    // Constructor 2
    Customer(String name) {
        this.name = name;
    }

    // Constructor 3
    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 4
    Customer(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Constructor 5
    Customer(String name, int age, String id, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Student
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Alice", 20);
        Student student4 = new Student("Alice", 20, "S123");
        Student student5 = new Student("Alice", 20, "S123", "Computer Science", 3.9);

        // Creating objects of Employee
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Bob");
        Employee employee3 = new Employee("Bob", 30);
        Employee employee4 = new Employee("Bob", 30, "E123");
        Employee employee5 = new Employee("Bob", 30, "E123", "Engineering", 75000);

        // Creating objects of Customer
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Charlie");
        Customer customer3 = new Customer("Charlie", 40);
        Customer customer4 = new Customer("Charlie", 40, "C123");
        Customer customer5 = new Customer("Charlie", 40, "C123", "123 Main St", "555-1234");
    }
}
