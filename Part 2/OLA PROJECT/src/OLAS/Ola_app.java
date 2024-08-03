package OLAS;
import java.util.Scanner;
public class Ola_app {

	public static void main(String[] args) {
		Ola ola=new Ola();
		  //user.addAuto(new Auto());
		 // user.a.DisplayAutoinfo();
		  
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the choose for user 1 and for driver 2");
		  int opt=s.nextInt();
		  
		  if(opt==1)
		  {       
			  User u=new User();
			  System.out.println("Please enter details to booking vehicals");
			  System.out.println("Enter name ");
			  String names=s.next();
			  System.out.println("Enter user phone");
			  int phn=s.nextInt();

			  System.out.println("Enter starting point");
			  String sp =s.next();
			  System.out.println("enter ending point");
			  String ep=s.next();
			  u.setuserDetails("VARUN",3843, 34);
			  //u.displayUserInfo();
			  System.out.println("Enter the choice 1 for Auto");
			  System.out.println("Enter the choice 2 for Bike");
			  System.out.println("Enter the choice 3 for Car");
			  int o=s.nextInt();
			  switch(o)
			  {
			     case 1:
			     {
			    	     System.out.println("You have selected Auto");
			    	     ola.addAuto(new Auto());
			    	    System.out.println("Auto details:") ;  
			    	    ola.a.getAutoDetails();
			    	    System.out.println("Wait for Auto, it is on the way.");
			    	      
			     }    
			     break;
			     case 2:
			     {
			    	 System.out.println("You have selected Bike.");
		    	     ola.addBike(new Bike());
		    	    System.out.println("Bike details:") ;  
		    	    ola.b.getBikeDetails();
		    	    System.out.println("Wait for Bike, it is on the way.");
			    	 
			     }
			    break;
			     case 3:
			     {
			    	 System.out.println("You have selected Car.");
		    	     ola.addCar(new Car());
		    	    System.out.println("Car details:") ;  
		    	    ola.c.getCarDetails();
		    	    System.out.println("Wait for Car, it is on the way.");
			    	 
			     }
			     break;
			     default:
			     {
			    	 System.out.println("Invalid choice, please try again.");
			     }
			  }
			  
			  
		  }
		  else if(opt==2)
		  {
			  Driver d=new Driver();
			    
			  System.out.println("Hi " + d.D_name + ", you are now connecting with a user. Please wait for a new user.");
		  }
		  else 
		  {
			  System.out.println("Invalid choice, please try again.");
		  }
		  
		
		  
		  
		    
		  
		  
		  
		  
		 
		    
		  
		  
		 

	}

}
