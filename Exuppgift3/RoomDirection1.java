package Exuppgift3;


// this class is for methods when the user took north way
public class RoomDirection1 extends Cave {
    public static void swordRun() {
        // ask user witch way the would like to go
        if (option.equals("p")) {
            System.out.println("\n" + gameName +" would want to go south [s] or east [e]");
            // calling for method
            enemyRoomRun1();

            // take the user back if the do wrong command
        } else {
            System.out.println("wrong direction " + gameName +" , go back");
            // calling for method
            firstRoom();
        }
    }
    public static void enemyRoomRun1() {
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
                    int damageDealt = Player.attackRegularDamage;
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

                    // if statement that make drinking health potion
                } else if (option.equals("2")) {
                    if (Player.numHealthPotions > 0) {
                        Player.health += Player.healthPotionHealAmount;
                        Player.numHealthPotions--;
                        System.out.println("\t- You drink a health potion, healing yourself for " + Player.healthPotionHealAmount
                                + "\n\t- You now have " + Player.health + " HP."
                                + "\n\t- You have " + Player.numHealthPotions + " health potions left.\n");

                        // else statement that tells user that the input is not possible
                    } else {
                        System.out.println("\t> You have no health potions left!\n");
                    }

                }  else {
                    System.out.println("\tCommand incorrect");
                }
            }

            // if statement that end the game when user have to low health
            if (Player.health < 1) {
                System.out.println("\n\t#######################");
                System.out.println("\t###### GAME OVER ######");
                System.out.println("\t#######################");
                System.exit(0);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println(" * " + enemy + " was defeated!");
            System.out.println(" * You have " + Player.health + " HP left.");

            // calling for method
            enimiesRoom2Run();
        }
    }
    public static void enimiesRoom2Run() {
        System.out.println("You can go north [n]");
        System.out.println("You can go east [w]");
        option = in.nextLine();
        if (option.equals("n")) {
            healthPotionRun2();

        } else if (option.equals("w")) {
            keyRoomRun2();
        }
    }
    public static void healthPotionRun2() {
        boolean running = true;
        HealthPotionloop:
        while (running) {
            Sketches.HealthPotionPrint();
            System.out.println("You see a health potion laying on the floor, you can pick it up [p]");
            option = in.nextLine();
            if (option.equals("p")) {
                Player.numHealthPotions++;
                System.out.println("You picked up the health potion, it's maybe helpful later.");
                System.out.println("You have " + Player.numHealthPotions + " health potions.");
                System.out.println("There is one opening at south, press [s]");
                option = in.nextLine();
                if (option.equals("s")) {
                    RoomDirection2.treasureGameRoom();
                }
            } else {
                System.out.println("Wrong direction, go back");
                continue HealthPotionloop;
            }
        }
    }
    public static void keyRoomRun2() {
        boolean running = true;
        Keychoice:
        while (running) {
            System.out.println("You see a key laying on the floor, you can pick it up [p] or go on [g]");
            option = in.nextLine();
            if (option.equals("p")) {
                Player.key++;
                System.out.println("You picked up the key, it's maybe helpful later.");
                enemiesRoom2Run();
                break;
            } else {
                System.out.println("You missed a change for finding the treasure.");
                System.out.println("Would you like to go back? yes or no");
                option = in.nextLine();
                if (option.equals("yes") || option.equals("Yes")) {
                    continue Keychoice;
                } else if (option.equals("no") || option.equals("No")) {
                    System.out.println("Hope the key is not that important.");
                    enemiesRoom2Run();
                } else {
                    System.out.println("Wrong direction, go back.");
                    continue Keychoice;
                }
            }
        }
        
    }
    public static void enemiesRoom2Run() {
        System.out.println("\tYou can go north [n]");
        System.out.println("\tYou can go east [e]");
        option = in.nextLine();
        if (option.equals("n")) {
            Sketches.dragonprint();
            System.out.println("An angry dragon appears!");
            System.out.println("The dragon attacks you and you hurt...");
            System.out.println("You need to find the treasure before leaving the dungeon.");
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
                System.out.println("You did use the key and it fits, now the door opens.");
                healthPotionRun2();
            } else {
                System.out.println("You have to have an key to open the door.");
                keyRoomRun2();
            }
        } else {
            System.out.println("Oops! The key maybe need som love, kiss it and try again.");
            doorRoomRun();
        }
    }

}
