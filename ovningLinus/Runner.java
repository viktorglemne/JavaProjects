package ovningLinus;

import java.util.Scanner;

public class Runner {
        public static void main(String []args){

            Scanner input = new Scanner(System.in);
            Scanner intput = new Scanner(System.in);

            //Deklarerar variabler
            String fName, eName;
            int age;

            //Hämtar uppgifter från gubbe
            System.out.println("Ange förnamn på gubben");
            fName = input.nextLine();

            System.out.println("Ange efternamn på gubbenm");
            eName = input.nextLine();

            System.out.println("Ange gubbens ålder");
            age = intput.nextInt();

            //Skapar ett objekt av Gubbar, matar in variabler.
            Gubbar gubbe = new Gubbar(fName, eName, age);

            //Deklararer variabel för hela nammnet
            String gubbeFullName;

            //Kalla på metoden getFullName i klassen Gubbar
            gubbeFullName = gubbe.getFullName();

            //Skriver ut hela namnet på gubben.
            System.out.println(gubbeFullName);

        }
    }
