package com.glemne;

import java.util.Scanner;

// Java has one important arithmetical operator you may not be familiar with, %,
// also known as the modulus or remainder operator.
// The % operator returns the remainder of two numbers.
// For instance 10 % 3 is 1 because 10 divided by 3 leaves a remainder of 1.
// You can use % just as you might use any other more common operator like + or -.

public class Theremainder {
    public static void main (String args[]) {

        int i = 10;
        int j = 3;
        int k;

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        k = i%j;
        System.out.println("i%j is " + k);
    }

}
