package com.glemne;

import java.util.Scanner;

public class LogginText {

    public static Scanner in = new Scanner(System.in);
    public static String user, pass;

    public static void main(String[] args) {
        new LogginText().printLoggin();
    }

    public static void printLoggin() {
        System.out.println("Enter you username");
        user = in.nextLine();

        System.out.println("Enter your password");
        pass = in.nextLine();

        if (user.equals("Leia") && pass.equals("hej123")) {
            System.out.println("Welcome Princess Leia.");
        } else {
            System.out.println("Wrong password or username\ntry again");
            LogginText.printLoggin();
        }
    }
}
