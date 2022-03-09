package Gym1;

import java.util.Scanner;

public class GymMeny {
    
    public static void main(String[] args) {
                
    System.out.printf("Välkommen till Gym WakeUp!%n" +
            "%n1. Bli medlem" +
            "%n2. Logga in" +
            "%n3. Boka plats på aktivitet" +
            "%n4. Avsluta%n");
        //menyn med 4 val
        Scanner scan = new Scanner(System.in);
        boolean inloggad = false;
        Login login = new Login();
     
        while (scan.hasNext()) {
            int val = scan.nextInt();

            // switch för de olika menyvalen
            switch (val) {
                case 1:
                    Kostnad.members(args);
                    break;
                case 2:
                    //anropa login, tilldela return
                    inloggad = login.login();
                    break;
                case 3:
                    // Om inloggad är false nås ej bokning
                    if (inloggad == false) {
                        System.out.printf("Logga in först...%n%n");
                        GymMeny.main(args); }
                    else
                        Aktiviteter.meny2(args);
                    break;
                case 4:
                    System.out.printf("Avslutar...%n");
                    System.exit(0);
                    break;
                default:
                    System.out.printf("Ange giltigt val, 1-4%n");
                    break;
            }
        }
    }
}

              

    

