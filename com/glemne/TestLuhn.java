package com.glemne;

public class TestLuhn {

    public static void main(String[] args) {

        String input ="9607310910";
        System.out.println(validatePersonnummer(input));
    }

    private static boolean validatePersonnummer (String input)
    {
        int[] creditCardInt = new int[input.length()];

        for (int i = 0; i < input.length(); i++)
        {
            creditCardInt[i] = Integer.parseInt(input.substring(i,i + 1));
        }
            for (int i = creditCardInt.length - 2; i >= 0; i = i -2)
            {
            int tempValue = creditCardInt[i];
            tempValue = tempValue * 2;
            if (tempValue > 9)
            {
                tempValue = tempValue % 10 + 1;
            }
            creditCardInt[i] = tempValue;
        }

            int total = 0;
            for (int i =0; i < creditCardInt.length; i++)
            {
                total += creditCardInt[i];
            }
            if (total % 10 == 0)
            {
                return true;
            }
            else {
                return false;
            }

    }

}



