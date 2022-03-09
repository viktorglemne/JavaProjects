package TentaLosning;

import java.util.ArrayList;

public class BankController {
    ArrayList<Account> accountList = new ArrayList(); //deklarering av array accountList
    ArrayList<Transaction> transactionList = new ArrayList(); //deklarering av array transaktionList

    Account a;
    Transaction t;

    //spara registrerad transaktion i ArrayList
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    //registrera transaktion
    public void regTransaction(int from, int amount) {
        t = new Transaction();
        t.setKontonummer(from);
        t.setAmount(amount);
        addTransaction(t);

    }
    //skriv ut lista på alla transaktioner
    public void printAllTransactions() {
        System.out.println("----Transaktioner----");
        int i = 0;
        for (Transaction bc : transactionList) {
            System.out.println("(" + i + ") " + "Konto med kontonummer: " + bc.getKontonummer() +
                    " har gjort följande transaktion: " + bc.getAmount()); i++;
        }
    }
    //spara registrerat konto i ArrayList
    public void addAccount(Account account){
        accountList.add(account);
    }

    //registrera konto
    public void regAccount(int account, int amount, int kredit){
        a = new Account();
        a.setAccount(account);
        a.setBalance(amount);
        a.setKredit(kredit);

        addAccount(a);
    }
    //Skriv ut lista på alla konton
    public void printAllAccount(int account) {
        System.out.println("----Bankkonton----");
        int i = 0;
        for (Account ac : accountList) {
            if (ac.getAccount() == account)
                System.out.println("(" + i + ") " + " : " + ac.getAccount() + " : " + ac.getBalance());
            i++;
        }
    }
    //överföring av pengar mellan konton
    public void balanceTransfer(int from, int to, int amount){
        for (Account ac : accountList){
            if (ac.getAccount() == from) {
                int balance = ac.getBalance();
                ac.setBalance(balance - amount);
            }
            if (ac.getAccount() == to) {
                int balance = ac.getBalance();
                ac.setBalance(balance + amount);
            }
        }
    }
    // insättning av pengar på konto
    public void makeDeposit(int account, int amount){
        if(amount <= 0){
            System.out.println("Summan måste vara större än 0");
        } else {
            for (Account ac : accountList) {
                if (ac.getAccount() == account) {
                    int balance = ac.getBalance();
                    ac.setBalance(balance + amount);
                }
            }
            System.out.println(amount + "kr är insatt på konto " + account);
        }
    }
    // uttag av pengar från konto
    public void makeWithdraw(int account,int amount) {
        if (amount <= 0) {
            System.out.println("Uttaget måste vara större än 0");
        } else {
            for (Account ac : accountList) {
                if (ac.getAccount() == account) {
                    int balance = ac.getBalance();
                    ac.setBalance(balance - amount);
                }
            }
            System.out.println("");
            System.out.println(amount + "kr är uttaget från konto " + account);
        }
    }
    //kontrollerar att summan inte blir negativ på kontot efter överföring
    public boolean balanceOk(int account, int amount) {
        int balance = 0;
        int kredit = 0;
        for (Account ac : accountList) {
            if (ac.getAccount() == account) {
                balance = ac.getBalance();
                kredit = ac.getKredit();
            }
        }
        if (balance < amount && kredit >= amount) {
            int result = kredit - amount;
            System.out.println("Täckning fanns inte på kontot. Din kredit har minskat med " + amount + "kronor");
            return result >= 0;
        } else {
            int result = balance - amount;
            return result >= 0;
        }
    }
}
