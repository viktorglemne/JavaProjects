package Exuppgift3;

// this class is for methods when the user took south way
public class RoomDirection2 extends Cave {
    public static void healthPotionRun() {

        if (option.equals("p")) {
            System.out.println("\tYou can go South [s]");
            System.out.println("\tYou can go East [e]");
            optionFightRun();

        } else {
            System.out.println("wrong direction, go back");
            RoomDirection1.firstRoom();
        }
    }
    public static void optionFightRun() {
        // store the input from user in variable option from last question
        option = in.nextLine();

        // if statement that take the input from the user in last question
        if (option.equals("e") || option.equals("s")) {
            System.out.println("A " + enemy + " appeared!");

            // name for the loop so you can call on it late on
            LoopFight:
            // loop for the fight
            while (enemyRegularHealth > 0) {
                System.out.println("\t- Your HP: " + Player.health);
                System.out.println("\t- " + enemy + "'s HP: " + enemyRegularHealth);
                System.out.println("\t\tWhat would you like to do?");
                System.out.println("\t\t1. Attack");
                System.out.println("\t\t2. Drink health potion");

                // store the input from user in variable option from last question
                option = in.nextLine();

                // if statement that make the attack function
                if (option.equals("1")) {
                    int damageDealt = rand.nextInt(Player.attackRegularDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    // function that decreasing health
                    enemyRegularHealth -= damageDealt;
                    Player.health -= damageTaken;

                    System.out.println("\t- The " + enemy + " strike you with " + damageTaken);
                    System.out.println("\t- You strike the " + enemy + " back for " + damageDealt + " damage.");

                    // if statement that break the loop when user have to low health
                    if (Player.health < 1) {
                        System.out.println("\t- You have taken to much damage, you are to weak to gon on!");
                        // breaking the loop
                        break;
                    }

                } else if (option.equals("2")) {
                    if (Player.numHealthPotions > 0) {
                        Player.health += Player.healthPotionHealAmount;
                        Player.numHealthPotions--;
                        System.out.println("\t- You drink a health potion, healing yourself for " + Player.healthPotionHealAmount
                                + "\n\t- You now have " + Player.health + " HP."
                                + "\n\t- You have " + Player.numHealthPotions + " health potions left.\n");

                        // else statement that tells user that the input is not possible
                    } else {
                        System.out.println("\t- You have no health potions left!\n");
                    }

                } else {
                    System.out.println("\tCommand incorrect");
                }
            }
            // if statement that end the game when user have to low health
            if (Player.health < 1) {
                System.out.println("#######################");
                System.out.println("###### GAME OVER ######");
                System.out.println("#######################");
                System.exit(0);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println(" * " + enemy + " was defeated! # ");
            System.out.println(" * You have " + Player.health + " HP left. #");
            System.out.println(" * Press [enter] to continue ");

            // calling for method
            enemyRoomRun1();
        }
    }
    public static void enemyRoomRun1() {
        option = in.nextLine();
        boolean running = true;
        FightEnemy:
        System.out.println("You have to drink an health potion to" +
                "\nhave a chance for a fight with a dragon!");
        YesorNo:
        while (running) {
            System.out.println("Would you like to drink an health potion? yes or no");
            option = in.nextLine();
            WeastorEast:
            while (running) {
                if (option.equals("yes")) {
                    Player.health += Player.healthPotionHealAmount;
                    Player.numHealthPotions--;
                    System.out.println("\t> You drink a health potion, healing yourself for " + Player.healthPotionHealAmount
                            + "\n\t> You now have " + Player.health + " HP."
                            + "\n\t> You have " + Player.numHealthPotions + " health potions left.\n");
                    System.out.println("\tYou can go West [w]");
                    direction = in.nextLine();
                    if (direction.equals("w")) {
                        keyRoomRun();
                    } else {
                        System.out.println("Wrong direction, go back");
                        continue WeastorEast;
                    }
                } else if (option.equals("no")) {
                    System.out.println("You can't defeat another enemy if you don't drink an health potion");
                    continue YesorNo;
                } else {
                    System.out.println("Wrong direction, go back");
                    enemyRoomRun1();
                }
            }
        }
    }
    public static void keyRoomRun() {
        boolean running = true;
        Keychoice:
        while (running) {
            System.out.println("You see a key laying on the floor, you can pick it up [p] or go on [g]");
            option = in.nextLine();
            if (option.equals("p")) {
                Player.key++;
                System.out.println("You picked up the key, it's maybe helpful late");
                enimiesRoom1Run();
                break;
            } else {
                System.out.println("You missed a change for finding the treasure");
                System.out.println("Would you like to go back? yes or no");
                option = in.nextLine();
                if (option.equals("yes") || option.equals("Yes")) {
                    continue Keychoice;
                } else if (option.equals("no") || option.equals("No")) {
                    System.out.println("Hope the key is not that important");
                    enimiesRoom1Run();
                } else {
                    System.out.println("Wrong direction, go back");
                    continue Keychoice;
                }
            }
        }
    }
    public static void enimiesRoom1Run() {
        System.out.println("\tYou can go north [n]");
        System.out.println("\tYou can go east [e]");
        option = in.nextLine();
        if (option.equals("n")) {
            Sketches.dragonprint();
            System.out.println("An angry dragon appears!");
            System.out.println("The dragon attacks you and you hurt...");
            System.out.println("You need to find the treasure before leaving the cave.");
            DirectionLoop:
            while (true) {
                System.out.println("Escape from the dragon, go east [e]");
                option = in.nextLine();
                if (option.equals("e")) {
                    doorRoomRun();
                } else {
                    continue DirectionLoop;
                }
            }

        } else if (option.equals("e")) {
            doorRoomRun();
            }
        }
    public static void doorRoomRun() {
        Sketches.doorPrint();
        System.out.println("You see an door, press [o] for trying to open it.");
        option = in.nextLine();
        if (option.equals("o")) {
            if (Player.key > 0) {
                System.out.println("You did use the key and it fits, now the door opens");
                pickUpSword();
            } else {
                System.out.println("You have to have an key to open the door");
                keyRoomRun();
            }
        } else {
            System.out.println("Oops! The key maybe need som love, kiss it and try again");
            doorRoomRun();
        }
    }
    public static void pickUpSword() {
        PickUpSword:
        while (true) {
            Sketches.SwordPrint();
            System.out.println("You see a sword on the floor, you can pick it up [p].");
            option = in.nextLine();
            if (option.equals("p")) {
                Player.attackRegularDamage += 2;
                System.out.println("You picked up the sword.");
                System.out.println("Your attack damage was increased to " + Player.attackRegularDamage);
                OptionWest:
                while (true) {
                    System.out.println("There is one opening at west, press [w].");
                    option = in.nextLine();
                    if (option.equals("w")) {
                        treasureGameRoom();
                        break OptionWest;
                    } else {
                        System.out.println("Wrong direction, try again.");
                        continue OptionWest;
                    }
                }
            } else {
                System.out.println("Oops! Wrong command, try again");
                continue PickUpSword;
            }
        }
    }
    public static void treasureGameRoom() {
        Sketches.treasurePrint();
        TreasureLoop:
        while (true) {
            System.out.println("\nYou did find the treasure." +
                    "\nNow you have to get out from the dungeon");
            System.out.println("Go east for exit, [e]");
            option = in.nextLine();
            if (option.equals("e")) {
                DragonFightRoom();
                break TreasureLoop;
            } else {
                continue TreasureLoop;
            }
        }
    }
    public static void DragonFightRoom() {
        Sketches.dragonprint();
        System.out.println("A " + enemiesDragon + " appeared!");

        LoopFight:
        while (enemyDragonHealth > 0) {
            System.out.println("\t- Your HP: " + Player.health);
            System.out.println("\t- " + enemiesDragon + "'s HP: " + enemyDragonHealth);
            System.out.println("\t\tWhat would you like to do?");
            System.out.println("\t\t1. Attack");
            System.out.println("\t\t2. Drink health potion");

            option = in.nextLine();
            if (option.equals("1")) {
                int damageDealt = rand.nextInt(Player.attackRegularDamage);
                int damageTaken = rand.nextInt(enemyAttackDamage++);

                enemyDragonHealth -= damageDealt;
                Player.health -= damageTaken;

                System.out.println("\t- The " + enemiesDragon + " strike you with " + damageTaken);
                System.out.println("\t- You strike the " + enemiesDragon + " back for " + damageDealt + " damage.");

                if (Player.health < 1) {
                    System.out.println("\t- You have taken to much damage, you are to weak to gon on!");
                    break LoopFight;
                }

            } else if (option.equals("2")) {
                if (Player.numHealthPotions > 0) {
                    Player.health += Player.healthPotionHealAmount;
                    Player.numHealthPotions--;
                    System.out.println("\t- You drink a health potion, healing yourself for " + Player.healthPotionHealAmount
                                + "\n\t- You now have " + Player.health + " HP."
                                + "\n\t- You have " + Player.numHealthPotions + " health potions left.\n");
                } else {
                    System.out.println("\t- You have no health potions left!\n");
                    }
            } else {
                System.out.println("\tCommand incorrect");
            }

        }
            if (Player.health < 1) {
                System.out.println("#######################");
                System.out.println("###### GAME OVER ######");
                System.out.println("#######################");
                System.exit(0);

            }
        System.out.println("-----------------------------------------------------------");
        System.out.println("#########################################");
        System.out.println("######### DRAGON WAS DEFEATED!! #########");
        System.out.println("#########################################");
        System.out.println("######## YOU HAVE WON THE GAME!! ########");
        System.out.println("#########################################");
        System.exit(0);
    }

}

