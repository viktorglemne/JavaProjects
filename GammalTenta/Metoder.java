package GammalTenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Metoder {
    public int val;
    public String password;
    public String username;
    public String lastname;
    public Scanner in = new Scanner(System.in);
    public ArrayList<String> name = new ArrayList<String>();
    public ArrayList<String> pass = new ArrayList<String>();
    public HashMap<String, String> mapList = new HashMap<String, String>();

    public void welcomeRun() {
        System.out.println("Vad vill du göra?");
        System.out.println("1. Skapa konto");
        System.out.println("2. Utför transaktion");
        System.out.println("3. Visa transkation för konto");
        System.out.println("4. Avsluta");
        val = in.nextInt();
    }

    public void valRun() {
        switch (val) {
            case 1:
                logIn();
                break;
            case 2:
                System.out.println("konto");
                break;
            case 3:
                System.out.println("konto");
                break;
            case 4:
                System.exit(0);
                break;

        }
    }
    public void logIn() {
        System.out.println("skriv användarnamn: ");
        name.add(in.next());
        System.out.println("Skriv lösen: ");
        pass.add(in.next());
        mapList.put(name.get(0), pass.get(0));
        name.clear();
        pass.clear();
        System.out.println("info som är sparad:");
        System.out.println(mapList);
        System.out.println("Du är nu inloggad");
        welcomeRun();
    }
}

