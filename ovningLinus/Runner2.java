package ovningLinus;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {
        int antalGubbar, age;
        String fName, eName;
        Scanner input = new Scanner(System.in);
        Scanner intput = new Scanner(System.in);

        //Initizierar en ArrayList
        ArrayList<Gubbar> gbr = new ArrayList<Gubbar>();


        System.out.println("Hur många gubbar vill du lägga till?");
        antalGubbar = input.nextInt();

        //"Forloop". Loopar tills x har uppnått det man anger.
        for (int x = 0; x < antalGubbar; x++) {
            Scanner in = new Scanner(System.in);
            //Hämtar uppgifter från gubbe
            System.out.println("Ange förnamn på gubben");
            fName = in.nextLine();

            System.out.println("Ange efternamn på gubbenm");
            eName = in.nextLine();

            System.out.println("Ange gubbens ålder");
            age = intput.nextInt();

            //Skapar ett objekt av Gubbar, matar in variabler.
            Gubbar gubbe = new Gubbar(fName, eName, age);

            //Lägger till objeketet Gubbe i en lista.
            gbr.add(gubbe);
        }
    }
}
