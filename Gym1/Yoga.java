package Gym1;

import java.util.ArrayList;
import java.util.Scanner;

        public class Yoga {
            
            
    
  public static void yoga(String[] args) {

 
    ArrayList<String> spinning = new ArrayList<>(8);
  
   for (int i = 0; i < 9; i++) {
 spinning.add("Ledig");}
  spinning.set(0, "Bokad"); //bokade platser sedan tidigare
  spinning.set(4, "Bokad");
  spinning.set(7, "Bokad");
  spinning.set(8, "Bokad");

   System.out.printf("Boka din plats på yoga%n%n1A %s - 1B %s - 1C %s%n2A %s - 2B %s - 2C %s%n3A %s - 3B %s - 3C %s%n%nSkriv in vilken plats du vill boka:%n",spinning.get(0),spinning.get(1),spinning.get(2),spinning.get(3),spinning.get(4),spinning.get(5),spinning.get(6),spinning.get(7),spinning.get(8));
   
        Scanner scan = new Scanner(System.in);
        
        String p;
        p = scan.nextLine();      
        
        if (p.equalsIgnoreCase("1a")==true) {
            if (spinning.get(0).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                  else {spinning.set(0, "Bokad");System.out.printf("Du har bokat plats 1A%n %n"); }}
        
        
        if (p.equalsIgnoreCase("1b")==true) {
            if (spinning.get(1).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(1, "Bokad");System.out.printf("Du har bokat plats 1B%n %n"); }}
        
          if (p.equalsIgnoreCase("1c")==true) {
            if (spinning.get(2).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(2, "Bokad");System.out.printf("Du har bokat plats 1C%n %n"); }}
          
          if (p.equalsIgnoreCase("2a")==true) {
            if (spinning.get(3).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(3, "Bokad");System.out.printf("Du har bokat plats 2A%n %n"); }}
          
          if (p.equalsIgnoreCase("2b")==true) {
            if (spinning.get(4).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(4, "Bokad");System.out.printf("Du har bokat plats 2B%n %n"); }}
          
          if (p.equalsIgnoreCase("2c")==true) {
            if (spinning.get(5).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(5, "Bokad");System.out.printf("Du har bokat plats 2C%n %n"); }}
          
          if (p.equalsIgnoreCase("3a")==true) {
            if (spinning.get(6).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(6, "Bokad");System.out.printf("Du har bokat plats 3A%n %n"); }}
          
          if (p.equalsIgnoreCase("3b")==true) {
            if (spinning.get(7).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine();}
                   else {spinning.set(7, "Bokad");System.out.printf("Du har bokat plats 3B%n %n"); }}
          
          if (p.equalsIgnoreCase("3c")==true) {
            if (spinning.get(8).equals("Bokad")) {
                System.out.printf("Plats redan bokad, välj annan plats%n %n");p = scan.nextLine() ;}
                   else {spinning.set(8, "Bokad");System.out.printf("Du har bokat plats 3C%n %n"); }}
          
        
        System.out.printf("1A %s - 1B %s - 1C %s%n2A %s - 2B %s - 2C %s%n3A %s - 3B %s - 3C %s%n%n", spinning.get(0),spinning.get(1),spinning.get(2),spinning.get(3),spinning.get(4),spinning.get(5),spinning.get(6),spinning.get(7),spinning.get(8));
        
        System.out.printf("1. Boka ny aktivitet%n2. Tillbaka till huvudmneny%n");
p = scan.nextLine();
if (p.equals("1")) {Aktiviteter.meny2(args);
        }
if (p.equals("2")) {GymMeny.main(args);
        }
else System.out.printf("Ogiltigt val, välj 1 eller 2%n");
        

  }
        }