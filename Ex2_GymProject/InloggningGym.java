package Ex2_GymProject;

import java.util.Scanner;

public class InloggningGym extends BokaPass {
    NyMedlem medlemny = new NyMedlem();

    public void loggaIn() {
        Scanner intput = new Scanner(System.in);

        String pnr = medlemny.pnr2;

        System.out.println("Ange personnummer: ");
        pnr = intput.nextLine();
        if (true) {
            passVal();
        } else {
            System.out.println("\n testa igen");
            new Menyer().inloggMeny();
        }
    }
}
