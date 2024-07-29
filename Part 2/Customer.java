class Customer {
    String name;
    int age;
    String id;
    String address;
    String phoneNumber;

 public static void main(String[] args) {

Customer customer1 = new Customer();
        Customer customer2 = new Customer("Varun");
        Customer customer3 = new Customer("ANIKET", 40);
        Customer customer4 = new Customer("TASSAVVAR", 40, "C123");
        Customer customer5 = new Customer("ANIKET", 20, "C123", "1", "8299505767");
            }


    // Constructor 1
    Customer() {
        System.out.println("Default Constructor");

}

    // Constructor 2
    Customer(String name) {
             System.out.println("Name: " + name);

    }

    // Constructor 3
    Customer(String name, int age) {
                System.out.println("Name: " + name + ", Age: " + age);

    }

    // Constructor 4
    Customer(String name, int age, String id) {
                System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }

    // Constructor 5
    Customer(String name, int age, String id, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
  System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id + ", Address: " + address + ", PhoneNumber: " + phoneNumber);
    }
}