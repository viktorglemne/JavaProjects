package TentaLosning;

import java.util.Scanner;

public class Bank {
    static BankController bc = new BankController();
    static int accountNumber = 1000; //löpnummer för konton

    public static void main(String[] args) {
        showMeny(); //Anropar meny
    }

    public static void showMeny() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n 1. Skapa konto \n 2. Utför transaktion \n 3. Visatransaktioner för konto \n 4. Avsluta");

        while (true) {
            int menyVal = input.nextInt();
            switch (menyVal) {
                case 1: {
                    createAccount();
                    break;
                }
                case 2: {
                    transactionMeny();
                    break;
                }
                case 3: {
                    showTransactions();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Ogiltigt menyval");
                    break;
                }
            }
        }
    }
    //skapa konto
    public static void createAccount(){
        Scanner input = new Scanner(System.in);
        int account = accountNumber;
        int balance = 0;
        int kredit = 1000; //Varje kund antas få 1000 i kredit
        bc.regAccount(account, balance, kredit);
        System.out.println("Konto skapat med kontonr: " + accountNumber); accountNumber++;
    }
    public static void transactionMeny() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n 1. Insättning \n 2. Uttag \n 3. Överföring \n 4. Återgå till huvudmeny");
        while (true) {
            int menyVal = input.nextInt(); switch (menyVal) {
                case 1: { makeDeposit();
                    break; }
                case 2: { makeWithdraw(); break;
                }
                case 3: {
                    makeTransaction();
                    break; }
                case 4: { showMeny(); break;
                }
                default: {
                    System.out.println("Ogiltigt menyval");
                    break; }
            }
        }
    }
    // gör insättning på konto
    public static void makeDeposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange kontonummer för insättning");
        int account = input.nextInt();
        System.out.println("Ange belopp du vill sätta in på konto " + account);

        int amount = input.nextInt();

        if (amount >0) {
            bc.makeDeposit(account, amount);
            bc.regTransaction(account, amount);
            showMeny();
        }
    }
    // gör uttag från konto
    public static void makeWithdraw() {
        boolean withdraw;
        Scanner input = new Scanner(System.in);

        System.out.println("Ange kontonummer för uttag");
        int account = input.nextInt();
        System.out.println("Ange belopp du vill ta ut från konto " + account);
        int amount = input.nextInt();
        /* utreder om konto har tillräckligt högt saldo för uttaget, genomför uttaget om det visar sig vara riktigt */
        if (withdraw = bc.balanceOk(account, amount) && amount > 0) {
            bc.makeWithdraw(account, amount);
            bc.regTransaction(account, amount);
            showMeny();
        } else {
            System.out.println("Denna transaktion är inte tillåten. ");
            makeWithdraw();
        }
    }
    // gör överföring
    public static void makeTransaction(){
        Scanner input = new Scanner(System.in);
        boolean transfer;

        System.out.println("Från vilket konto ska överföringen ske?");
        int from = input.nextInt();

        System.out.println("Till vilket konto ska pengarna överföras till?");
        int to = input.nextInt();

        System.out.println("Ange summa för överföring"); int amount = input.nextInt();

        //kollar att kontot har täckning.
        transfer = bc.balanceOk(from, amount);

        //genomför överföring
        if (transfer) {
            bc.balanceTransfer(from, to, amount);
            bc.regTransaction(from, amount);
            System.out.println("Överföring klar");
            showMeny(); // återgår till huvudmeny

            // om belopp av överföring överstiger kontos balans och kredit
            // återgår program till huvudmeny }
        } else {
            System.out.println("Denna transaktion är inte tillåten, konto har ej täckning.");
            showMeny();
        }
    }
    // visa överföringar
    public static void showTransactions() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ange konto du vill visa transaktioner för: ");
        int account = input.nextInt();

        bc.printAllTransactions();
        showMeny();
    }
}
