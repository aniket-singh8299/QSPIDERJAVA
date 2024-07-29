
class Employee {
    String name;
    int age;
    String id;
    String department;
    double salary;
   public static void main(String[] args) {
        // Creating objects of Employee
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("ANIKET");
        Employee employee3 = new Employee("VARUN", 30);
        Employee employee4 = new Employee("TASAVVAR", 30, "E123");
        Employee employee5 = new Employee("KUNAL", 30, "E123", "Engineering", 75000);
    }


    // Constructor 1
    Employee() {
        System.out.println("Default");
    }

    // Constructor 2
    Employee(String name) {
        System.out.println("Name: " + name);
    }

    // Constructor 3
    Employee(String name, int age) {
                System.out.println("Name: " + name + ", Age: " + age);
    }

    // Constructor 4
    Employee(String name, int age, String id) {
                System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }

    // Constructor 5
    Employee(String name, int age, String id, String department, double salary) {
        
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id + ", Department: " + department + ", Salary: " + salary);
    }
}

    


