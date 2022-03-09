package Ex2_GymProject;

// import för att kunna utformas arraylist och scanner
import java.util.Scanner;

public class NyMedlem {
    public String pnr2;

    // En ArrayList för att svara värdet av personnummer vi inte fick att fungera
    // public ArrayList<String> pnr2 = new ArrayList<String>();

    public void medlemskap() {

        // Scanner för att ge värde till inmatad data
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv in uppgifter ");


        // spara värdet för pnr2
        System.out.print("\nAnge personnummer: ");
        pnr2 = input.nextLine();

        // kör värdet av pnr2 i validering
        LuhnCheck.validatePersonnummer(pnr2);
    }
}
