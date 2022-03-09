package TentaLosning;

public class Transaction {
    private int kontonummer;
    private int amount;

    public Transaction() {
    }

    //transaktion mellan konton
    public Transaction(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    //set-metod för kontonummer
    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    // get-metod för kontonummer
    public int getKontonummer() {
        return kontonummer;
    }
    // set-metod för storlek av överföring
    public void setAmount(int amount) {
        this.amount = amount;
    }
    // get-metod för storlek av överföring
    public int getAmount() {
        return amount;
    }
}
