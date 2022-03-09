package javakurs;

import javax.security.auth.login.AccountException;

public class lektion4 {
    public static void  main(String [] args) {
        double betyg;
        betyg = 88;
        if (betyg >= 80) {
            System.out.println("mycket väl godkänt");
        } else if (betyg >= 60) {
            System.out.println("väl godkänt");
        } else if (betyg >= 45) {
            System.out.println("godkänt");
        } else {
            System.out.println("fail");
        }
    }
}