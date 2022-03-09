package Exuppgift1;

import java.util.Arrays;

public class ArrayLatHund {
        public static void main(String[]args)
        {
            //En Array av Strings fylld med namn
            String [] namn = {"Tony", "Rickard", "Långben", "Kalle-Anka"};

            //Skriv innehållet av en Array.
            for(int x = 0; x < namn.length; x++ ){
                System.out.println(namn[x]);
            }

            //En Array som är fylld med ints(siffor)
            int [] siffror = {1, 2, 4, 5, 6, 7};

            //Skriver ut innehåll av Array med siffror
            for(int y = 0; y < siffror.length; y++){
                System.out.println(siffror[y]);
            }

            //En tom Array som har plats med 11 siffror.
            double [] tomArray = new double[10];

            //Fyller den tidigare tomma arrayen med random siffror
            for(int z = 0; z < tomArray.length; z++){
                double randomsiffra = Math.random();
                tomArray[z] = randomsiffra;
            }

            //Skriver ut arrayen som vi fyllde med random siffror
            for(int x = 0; x < tomArray.length; x++){
                System.out.println(tomArray[x]);
            }

        } public static int findSumUsingStrem(int[] array) {
            return Arrays.stream(array).sum();
    }

}

