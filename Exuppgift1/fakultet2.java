package Exuppgift1;

import java.util.Scanner;

public class fakultet2 {
    public static long fakultet(int nummer ) {

        long result = 1;
        //int tal;
        //int x = 1;

        // Scanner in = new Scanner (System.in);

        // System.out.println("sätt in ett tal: ");
        // tal = in.nextInt();


        // ( x har datatyp heltal med tal 1; x ska vara större eller lika med nummer för att loopen ska forstätta;
        // x++ gör så att ökningen är möjlig och talföjden fortsätter
        for (int x = 1; x <= nummer ;x++){

            // 1! = 1 * 0 men för x++ finns blir det 1 dvs fakultetstalet blir 1
            result = result *x;
        }
        return result;
    }
    public static void main(String[] args) {

        // for (int x = 0; x <= 20; x++) {

            System.out.println(fakultet(5));
        }
    }
