package Gym1;

import java.util.Scanner;

public class Aktiviteter {

    public static void meny2(String[] args) {
        System.out.printf("Boka aktiveteter på Gym WakeUp!%n%n1. Spinning%n2. Aerobics%n3. Yoga%n4. Tillbaka%n");
        //menyn med 4 val
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())      {
            int val = scan.nextInt();
            //switch för de olika valen
            switch (val){
           case 1:
               System.out.printf("Spinning%n");
               Spinning.spin(args);
               break;
           case 2:
               System.out.printf("Aerobics%n");
               Aerobics.aerobics(args);
               break;
           case 3:
               System.out.printf("Yoga%n");
               Yoga.yoga(args);
               break;
           case 4:
               GymMeny.main(args);
               break;
           default:
               System.out.printf("Ange giltigt val, 1-4%n");
               break;
            }
        }
    }
}
