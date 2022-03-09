package TentaLosning;

public class Account {
    private int account; //deklarering av konto
    private int balance; //deklarering av kontos balans/saldo
    private int kredit; //deklarering av kontos kredit

    public Account() {
    }

    public Account(int account) {
        this.account = account;
    }
    //get-metod för konto
    public int getAccount() {
    return account;
    }

    //get-metod för att ange ett konto
    public void setAccount(int account) {
    this.account = account;
    }

    //get-metod för kontos balans
    public int getBalance(){
        return balance;
    }
    //set-metod för att ange ett kontos balans
    public void setBalance(int balance) {
        this.balance = balance;
    }
    //set-metod för att ange ett kontos kredit
    public void setKredit(int kredit) {
        this.kredit = kredit;
    }
    //get-metod för kontos kredit
    public int getKredit() {
        return kredit;
    }
}
