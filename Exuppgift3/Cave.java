package Exuppgift3;

// makes it possible to create scanner object
import java.util.Scanner;

// this class is for the first methods and welcomes the user
public class Cave extends Monster{

    // public variables and scanner that are used in more classes
    public static Scanner in = new Scanner(System.in);
    public static String gameName;
    public static String direction;
    public static String option;

    public static void welcomeRun() {

        System.out.println("\t############################################################");
        System.out.println("\t#\t\t\tWelcome to Dragon Treasure                     #");
        System.out.println("\t# Write your name and press [Enter] to start a new game... #");
        System.out.println("\t############################################################");

        // store the value from the input that user write
        gameName = in.nextLine();
    }
    public static void playgameRun() {

        System.out.println("Welcome " + gameName + " to your treasure hunt. Beware of the dragon!");
        System.out.println("You are standing outside a cave. There is a smell of sulfur coming from the opening.");
        System.out.println("The cave opening is to your east. Write \"e\" and press [Enter] to enter the cave.");

        // store the value from the input that user write
        direction = in.nextLine();

        // if statement that do an functions that is dependent on the input before
        if (direction.equals("e")) {
            System.out.println("You have now entered the cave!");
            System.out.println("As you enter the cave the entrance collapses behind you.");
            System.out.println("The room is lit by a few candles sitting on a table in front of you.");
            firstRoom();

        } else {
            System.out.println("You gong wrong direction, try again.");

            // calls back the method playgameRun so the user can try again
            playgameRun();
        }
    }
    public static void firstRoom() {
        System.out.println(gameName +" where do you want to go:" +
                "\n\nSouth [s] or North [n]");

        // store the value from the input
        direction = in.nextLine();

        // if statement that do an functions that is dependent on the input before
        if (direction.equals("n"))
        {
            Sketches.SwordPrint();
            System.out.println("You see a sword on the floor,");
            System.out.println("you can pick it up [p]");
            option = in.nextLine();
            if (option.equals("p")) {

                // increase players attack damage with 2 buy using increment
                Player.attackRegularDamage += 2;
                System.out.println("You picked up the sword!");
                System.out.println("Your attack damage was increased to " + Player.attackRegularDamage);
            } else {
                System.out.println("You picked the wrong direction, try again.");
                firstRoom();
            }
            // calls for method
            RoomDirection1.swordRun();

        } else if (direction.equals("s"))
        {
            Sketches.HealthPotionPrint();
            System.out.println("You find a health potion, you can pick it up [p]");
            option = in.nextLine();
            if (option.equals("p")) {

                // increase players health potions with 1 buy using increment
                Player.numHealthPotions++;
                System.out.println("You picked up the health potion!");
                System.out.println("You have " + Player.numHealthPotions + " health potions.");
            } else {
                System.out.println("You gong wrong direction, try again.");

                // calls for method
                firstRoom();
            }

            // calls for method
            RoomDirection2.healthPotionRun();

        // else statement that take the user back if did wrong option
        // buy calling for the same methods
        } else {
            System.out.println("You gong wrong direction, try again.");

            // calls for method
            firstRoom();
        }
    }
}
