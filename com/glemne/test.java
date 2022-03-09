package com.glemne;

import com.sun.jdi.DoubleValue;
import org.w3c.dom.ls.LSOutput;
import java.lang.reflect.Member;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//
public class test {
    public static void main(String[] args) {
        int [] field = new int[25];
        // Gå igenom array
        for (int i = 0; i < field.length; i++){

            // Kolla ifall index är jämnt
            if(i % 2 == 0){
                field[i] = i;
            }

            // Om inte jämnt ge det värdet 1
            else{
                field[i] = 1;
            }

            // Skriva ut index med respektive värde
            System.out.println("Index " + i + ": " + field[i]);
        }
    }
}
//    public static void main(String[] args) {
//        methodOne();
//    }
//
//    static void methodOne() {
//        Scanner in = new Scanner(System.in);
//        String valueToSearch;
//        String arrayValue;
//        // initialize array
//        String[] array = {"Viktor", "Josef", "Emil", "Carl", "Simon", "Pelle", "Bert", "Johannes", "Leo"};
//        // initialize value to search
//        System.out.println("Witch name do you want to search for?");
//        valueToSearch = in.nextLine();
//        // initialize boolean variable
//        boolean isExists = false;
//        // iterate over array
//        for (int i = 0; i < array.length; i++) {
//            // get the value at current array index
//            arrayValue = array[i];
//            // compare values
//            if (valueToSearch.equals(arrayValue)) {
//                isExists = true;
//                // if value is found, terminate the loop
//                break;
//            }
//        }
//        if (isExists) {
//            System.out.println("String is found in the array at position: " + array);
//        } else {
//            System.out.println("String is not found in the array");
//        }
//    }
//}
//    public static void main(String[] args) {
//        int total = 0;
//        int[] field = {20, 33, 40, 55};
//        for (int element : field) {
//            total = total + element;
//        }
//        System.out.println(total);
//    }
//}
//    public static void main(String[] args) {
//        int x = 100;
//
//        do {
//            x-=2;
//            System.out.println(x);
//        } while (x > 0);
//    }
//}
//        System.out.println("Manoprabu.R");
//        ArrayList<String> name = new ArrayList<String>();
//        ArrayList<String> location = new ArrayList<String>();
//        HashMap<String,String> myMap = new HashMap<>();
//
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter your Name: ");
//            name.add(sc.next());
//            System.out.println("Please enter your Location: ");
//            location.add(sc.next());
//            myMap.put(name.get(0),location.get(0));
//            name.clear();
//            location.clear();
//            System.out.println(myMap);
//        }
//    }
//}
//    public static void main(String[] args) {
//        final int Ticket = 200;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Hur gammal är du?");
//        int age = in.nextInt();
//        if (age <= 18) {
//            System.out.println("ditt pris är " + (Ticket * 0.8) + " sek");
//        } else if (age >= 65) {
//            System.out.println("ditt pris är " + (Ticket * 0.7) + " sek");
//        } else {
//            System.out.println("ditt pris är " + Ticket + " sek");
//        }
//
//    }
//}
//        // Skapar tre konstanter, en int för hyran och en för internet samt en double för hemförsäkringen
//        final int RENT = 4500;
//        final int INTERNET = 100;
//        final double HOME_INSURANCE = 79.50;
//
//        // Ange din lön
//        int salary = 20000;
//
//        // Räknar ut hur mycket pengar kvar efter räkningar betalda
//        double moneyAfterBills = salary - (RENT + INTERNET + HOME_INSURANCE);
//
//        //Skriv ut hur mycket pengar som finns kvar
//        System.out.println("Pengar kvar efter att räkningarna är betalda: " + moneyAfterBills);
//    }
//}
//    ArrayList.add(lengthOfArray - 1, firstObject);
//ArrayList.add(lengthOfArray - 2, firstObject);
//    LuhnCheck luhn = new LuhnCheck();
//System.out.println("Ange personnummer");
//    String pnr = input.nextLine();
//
//
//while(!luhn.metodNamn(pnr)){
//        System.out.println("inte ett korrekt personnummer");
//        System.out.println("Ange personnummer");
//        String pnr = input.nextLine();