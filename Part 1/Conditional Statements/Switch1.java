class Switch1 {
    public static void main(String[] args) {
        char c = '2';
        switch (c) {
            case '1': 
                System.out.println("Sunday");
                break;
             case '2':
 
                System.out.println("Monday");
                break;
            
            case '7': 
                System.out.println("Saturday");
                break;
            
            default: 
                System.out.println("Invalid");
                break;
            }
        
    }
}

//can take char,int
//can take use nested switch inside case++
//Performance
//boolean value not accept
//== not use 


//Rules:-
//cannot take another character as initialization
//cannot take decimal values in case
//longint
//