package Gym1;

import java.util.Scanner;

public class Auth {
    
    
    public static void verify() {
        
        boolean inloggad = false;
        
        System.out.printf("Skriv in ditt personnummer i formatet ######-####%n"); //mata in personnummer
        
        Scanner scan = new Scanner(System.in);
        
        String pn = scan.next(); //pn blir personnumer som String
        
        
        char[] cArray = pn.toCharArray(); //pn görs om till Char i array
        
        if (cArray.length!=11) { //ifall inmatat nummer inte är 11 tecken långt kommer felmeddelande
            System.out.printf("Felaktigt format, försök igen%n");
            Auth.verify(); //metod startas om
        }
        else {
        int v0 = cArray[0] - '0'; v0=v0*2;v0=v0%10+v0/10; //array omvandlas till int, varannan dubblas, delas i 10 om möjligt och adderas med resten
        int v1 = cArray[1] - '0';
        int v2 = cArray[2] - '0'; v2=v2*2;v2=v2%10+v2/10;
        int v3 = cArray[3] - '0';
        int v4 = cArray[4] - '0'; v4=v4*2;v4=v4%10+v4/10;
        int v5 = cArray[5] - '0'; 
        int v6 = cArray[6] - '0'; //streck eller plus
        int v7 = cArray[7] - '0'; v7=v7*2;v7=v7%10+v7/10;
        int v8 = cArray[8] - '0';
        int v9 = cArray[9] - '0'; v9=v9*2;v9=v9%10+v9/10;
        int v10 = cArray[10] - '0';
        
        int vSum = v0+v1+v2+v3+v4+v5+v7+v8+v9+v10; //Summan av varje enskilt tal från beräkning ovan
        
        if(vSum % 10 == 0){ 
          System.out.printf("Personnummer OK%n"); //om summan % 10 inte får någon rest är pnr ok



        }
        else {
            System.out.printf("Du har matat in ett felaktigt personnummer, försök igen%n"); //Om det blir rest över division med 10 är det inte ok
            Auth.verify(); //starta om metod vid felaktigt
           
        }
    } 
}
}
        