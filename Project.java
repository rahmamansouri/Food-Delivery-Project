import java.util.Scanner;
public class Project {
    public static void main (String[]arg)
    { System.out.println("Hello welcome to the food app");
    System.out.println("Please create a password: ");
    Scanner scan = new Scanner (System.in);
    
    String pass1= scan.next();
        System.out.println("Your password is now:" + pass1);
        System.out.println("Please enter your password");

    String pass = scan.next();
    
    while(!pass.equals(pass1))
    {        System.out.println("This is not the right password please try again");
 
    pass = scan.next();
    
    }
    System.out.println("Access granted");
            System.out.println("Are you hungry? yes OR no ");
String ans1= scan.next();
if(ans1.equals("yes")){ 

      System.out.println("Choose what you want to eat between Pizza, Humburger or Fish ");
      
      String ans2= scan.next();
      
      while(!ans2.equals("Pizza")&&!ans2.equals("Humburger")&&!ans2.equals("Fish"))
      {     System.out.println("Sorry we do not have it. What would you like between Pizza, Humburger or Fish ");
      ans2 = scan.next();
      
      }
      
      if(ans2.equals("Pizza")|| ans2.equals("Hamburger")||ans2.equals("Fish"))
      { System.out.println("Do you want something to drink ? Yes OR No: ");
        String   ans3 = scan.next();

            while (!ans3.equals("Yes") && !ans3.equals("No")) {
            System.out.println("Wrong command please try again: ");
            ans3 = scan.next();
            
            }
            
            if(ans3.equals("Yes")){ 
           System.out.println("What would you like to drink Coke or Juice ?");
            String ans4 = scan.next();
            
             while (!ans4.equals("Coke") && !ans4.equals("Juice")) {
            System.out.println("Sorry we don't have it what would you like between coke and juice ");
            ans4 = scan.next();}
             
             if(ans4.equals("Coke")|| ans4.equals("Juice")){
                 
                 System.out.println("Great you have ordered" + ans2 + "and" + ans4);
                 
                 
  }
            
            System.out.println("Please confirm your Password");
             pass = scan.next();       
            while(!pass.equals(pass1))
    {        System.out.println("This is not the right password please try again");
 
    pass = scan.next();
    
    }
    System.out.println("Thanks your order is on your way :) ");
            
            
            }else {     System.out.println("You have ordered " + ans2);

            
      
             System.out.println("Please confirm your Password");
             pass = scan.next();       
            while(!pass.equals(pass1))
    {        System.out.println("This is not the right password please try again");
 
    pass = scan.next();
            
            
    }
            
            }
      
      }
      
      
      } else {System.out.println("Alright have a good day");  
      }
 
    
    
    }} 
    
    
    
    
    
    
    
    

