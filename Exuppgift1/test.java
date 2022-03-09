package Exuppgift1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valuta[] = { 1000, 500, 200,  100, 50, 20, 10, 5, 2, 1};
        double price, pay, change = 0;
        int result[] = new int[valuta.length];
        int y = 0, i = 0;

        System.out.println("Ange ett pris: ");
        price = in.nextInt();

        System.out.println("Du betalar: ");
        pay = in.nextInt();

        double rest = pay - price;

        for (double x : valuta) {

            if (x <= rest) {

                if ((rest % x) == 0) {
                    result[y] = (int) (rest / x);
                    rest = (rest % x);
                } else {
                    double subRest = rest % x;
                    result[y] = (int) ((rest - subRest) / x);
                    rest = subRest;
                }
                change += result[y]*x;
            }
            y++;
        }

        System.out.print("Växel: ");
        for (i = 0; i < valuta.length; i++) {
            if (result[i] > 0);
            {
                if(valuta[i] >= 1)
                   System.out.print(result[i] + "st " + (int)valuta[i] + "kr, ");
                // else
                   // System.out.print(result[i] + "st " + (int)(valuta[i]*100) + "öre, ");
            }
        }

        System.out.println("\nTotalt tillbaka: "+change+"kr");
    }

    public static double[] arraylist(){
       double valuta[] = { 1000, 500, 200,  100, 50, 20, 10, 5, 2, 1};
        return valuta;
    }

}

