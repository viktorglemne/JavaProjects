package Gym1;

import java.util.Scanner;
        
public class Kostnad {
    
    public static void members(String[] args) {

 Auth.verify();// anropar metod för verifiering

Scanner scan = new Scanner(System.in);

System.out.printf("Priser:%nMedlemskap: 100:-%nMånadskostnad:%n1-2m:  400:-/m%n3-6m:  350:-/m%n7-12m: 300:-/m%n13+m:  250:-/m%n%nI hur många månader vill du bli medlem?%n");


int monthlyPrice = 0;
int m = scan.nextInt(); //antal månader
int totalprice;
int medlemskap = 100;
int instaprice; //första betalning

        // visar de olika priserna för olika perioder
if (m > 12) {monthlyPrice = 250;}
if (m <= 12) {monthlyPrice = 300;}
if (m <= 6) {monthlyPrice = 350;}
if (m == 1 | m == 2){monthlyPrice = 400;}
if (m == 0) {monthlyPrice = 0;}
    
 totalprice = m*monthlyPrice+medlemskap;
 instaprice = monthlyPrice+medlemskap;

System.out.printf("Totalt pris för %d månader blir %dkr%nAtt betala nu: %dkr%n", m, totalprice,instaprice);
System.out.printf("Vill du skapa konto?%n 1. Ja%n 2. Nej%n");
        
int jn = scan.nextInt();  

if (jn == 1){
    SkapaKonto.kont(args); //till metod för att skapa konto
}
if (jn == 2){
    GymMeny.main(args); //tillbaka till main
}
if (jn > 2){
System.out.printf("Ogiltigt val, välj 1 eller 2%n");}
if (jn == 0) {
    System.out.printf("Ogiltigt val, välj 1 eller 2%n");
}
}
}