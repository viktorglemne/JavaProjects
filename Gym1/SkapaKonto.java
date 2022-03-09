package Gym1;
import java.util.Scanner;


public class SkapaKonto {
    

    
    public static void kont(String[] args) {
        
               
        Scanner scan = new Scanner(System.in);
        
         Account myAccount = new Account(); // ny instans av Account
        
              System.out.printf("Skriv in namn på ditt konto%n"); 
                
              String userName = scan.nextLine();
 
        myAccount.setName(userName);
        
        System.out.printf("Välj ett lösenord%n");
        
        String password = scan.nextLine();
        
        myAccount.setPassword(password);
             
        System.out.printf("Namn på ditt konto är nu %s%nDitt lösenord är:%s%n", myAccount.getName(), myAccount.getPassword());
        
        GymMeny.main(args);
        
    }
   
}