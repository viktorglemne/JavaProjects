package Ex2_GymProject;

public class LuhnCheck extends NyMedlem {
    public static boolean validatePersonnummer(String pnr2)
    {
        // tar in värdet på pnr2 som inmatats från NyMedlem och ger till input
        String input = pnr2;

        // Konverterar input till en int
        int[] persnum = new int[input.length()];

        for (int x = 0; x < input.length(); x++)
        {
            persnum[x] = Integer.parseInt(input.substring(x,x + 1));
        }

        // börjar från höger och dubblerar vart annat tal och om mer än 9 lägger den till 1
        for (int x = persnum.length - 2; x >= 0; x = x -2)
        {
            int tempValue = persnum[x];
            tempValue = tempValue * 2;
            if (tempValue > 9)
            {
                tempValue = tempValue % 10 + 1;
            }
            persnum[x] = tempValue;
        }

        // adderar alla parametrar
        int total = 0;
        for (int x = 0; x < persnum.length; x++)
        {
            total = total + persnum[x];
        }

        //utför näst funktion beroende på det är sant eller falskt personnummer
        if (total % 10 == 0)
        {
            new Medlemskap().medlemskapPris();
        }
        else {
            System.out.println("inkorrekt personnummer, testa igen");
            new Menyer().nyMedMeny();
        }
        return false;
    }
}
