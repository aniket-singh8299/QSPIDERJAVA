package mycal;

import com.example.calculator.addition.Addition;
import com.example.calculator.divisionprog.Division;
import com.example.calculator.subtraction.Subtraction;
import com.example.multiprog.product.Product;
//import com.example.calculator.extractprog.Uppercase;
import java.util.Scanner;

public class cal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("WELCOME TO CALCULATOR");
            System.out.println("Enter 1 for ADD");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 to Exit ");

            int opt = s.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Welcome to Addition");
                    System.out.println("Enter 1 for two number Addition ");
                    System.out.println("Enter 2 for three number Addition ");
                    int y = s.nextInt();
                    if (y == 1) {
                        System.out.println("Enter 1st Number:- ");
                        int num1 = s.nextInt();
                        System.out.println("Enter 2ND Number:- ");
                        int num2 = s.nextInt();
                        int Res=Addition.add(num1, num2);
                        System.out.println("Result is  "+Res);

                        
                    } else if (y == 2) {
                        System.out.println("Enter 1st Number:- ");
                        int num1 = s.nextInt();
                        System.out.println("Enter 2ND Number:- ");
                        int num2 = s.nextInt();
                        System.out.println("Enter 3rd Number:- ");
                        int num3 = s.nextInt();
                        Addition re = new Addition();
                        int Res=re.adds(num1, num2, num3);
                        System.out.println("Result is  "+Res);

                    }
                    else {
                        System.out.println("Invalid Option Please Try again");

                    }
                    break;

                case 2:
                    System.out.println("Welcome to Subtraction");
                    System.out.println("Enter 1st Number:- ");
                    int num3 = s.nextInt();
                    System.out.println("Enter 2ND Number:- ");
                    int num4 = s.nextInt();
                    Subtraction r = new Subtraction();
                    r.sub(num3, num4);
                    break;

                case 3:
                    System.out.println("Welcome to Multiplication");
                    System.out.println("Enter 1st Number:- ");
                    int num5 = s.nextInt();
                    System.out.println("Enter 2ND Number:- ");
                    int num6 = s.nextInt();
                    Product.Pro(num5, num6);
                    break;

                case 4:
                    System.out.println("Welcome to Division");
                    System.out.println("Enter 1st Number:- ");
                    int num7 = s.nextInt();
                    System.out.println("Enter 2ND Number:- ");
                    int num8 = s.nextInt();
                    Division.div(num7, num8);
                    break;
                    
//                    
//                case 5: System.out.println("Welcome to Conversion from Lower to Upper");
//                
//                System.out.println("Enter 1st character");
//                
//                char c= s.next().charAt(0);
//                    Uppercase.getLower(c);
//                    
//                    
//                 break;
//                	

                case 5:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option, please try again.");
//                    s.nextLine();
                    break;
            }
        }
    }
}