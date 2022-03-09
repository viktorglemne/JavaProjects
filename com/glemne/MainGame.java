package com.glemne;

import java.util.Random;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        // system objects
        Scanner in = new Scanner(System.in);
        // ger ett random nummer
        Random rand = new Random();

        // Game variables
        String[] enemies = {"Dragon", "Zombie", "Skeleton"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player variables
        // liv hero
        int health = 100;
        // skada som hero ger
        int attackDamage = 50;
        // ger liv til hero
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        // Procent
        int healthPotionDropChance = 50;

        boolean running = true;

        System.out.println("\nWelcome to the Dungeon!");

        GAME:
        while (running) {
            System.out.println("-----------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];

            // skriver ut tex, # Dragon has appeared! #
            System.out.println("\t# " + enemy + " has appeared! # \n");

            while (enemyHealth > 0) {
                System.out.println("\t> Your HP: " + health);
                System.out.println("\t> " + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();

                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the "+ enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You recieve " + damageTaken + " in retaliation!");

                    if (health < 1) {
                        System.out.println("\t> You have taken to much damage, you are to weak to gon on!");
                        break;
                    }

                }
                else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a healt potion, healing yourself for " + healthPotionHealAmount
                                + "\n\t> You now have " + health + " HP."
                                + "\n\t> You have " + numHealthPotions + " health potions left.\n");
                    }
                    else  {
                        System.out.println("\t> You have no helth potions left! Defeat enemies for at chance to get one!\n");
                    }

                }
                else if (input.equals("3")) {
                    System.out.println("\t> You run away " + enemy + "!");
                    continue GAME;
                }
                else {
                    System.out.println("\tInvalid command");

                }
            }

            if (health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle");
                break;
            }

            System.out.println("-----------------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");

            if (rand.nextInt(100 ) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # " + enemy + " dropped a health potion! #");
                System.out.println(" # You now have " + numHealthPotions + " helth potion(s). #");
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command");
                input = in.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue on your adventure");
            }
            else if(input.equals("2")) {
                System.out.println("You exit the dungeon, successful from you adventures!");
                break;
            }
        }

        System.out.println("######################");
        System.out.println("# Thanks for playing #");
        System.out.println("######################");
    }
}
