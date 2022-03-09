package Exuppgift1;

import java.util.Scanner;

public class fakultet3 {
    public static long karl(int tal) {
        long svar = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("ange fakultetsnummer: ");
        tal = in.nextInt();

        for (int x = 1; x <= tal; x++) {
            svar = svar *x;
        }
        return svar;
    }
    public static void main(String[] args) {

        // System.out.println(tal+ "!=" + svar);
    }
}
