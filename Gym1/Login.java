
package Gym1;

import java.util.Scanner;

public class Login {

        public boolean login() {
            
          boolean inloggad = true;
            
            Auth.verify(); // kör verifiering av pnr
                        
            System.out.printf("Skriv in ditt användarnamn%n");
            Scanner input = new Scanner(System.in);
            
            String user;
            String password;
            
            user = input.nextLine();
            System.out.printf("Skriv in ditt lösenord%n");
            password = input.nextLine();
            
            {System.out.printf("Välkommen %s%n1. Bli medlem%n2. Logga in%n3. Boka plats på aktivitet%n4. Avsluta%n", user);
         }
            //inlogg fungerar tyvärr inte mot ett riktigt konto, men metoden returnerar inloggad nedan, så att användare kan boka aktivitet

        return inloggad;
        
        
        
        }
}
