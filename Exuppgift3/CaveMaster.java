package Exuppgift3;

// Information about the game "Dragon Treasure" and how we did make it.
// We made some small change to what the task did say. That was:
// making players and monsters life and attack damage randomized for making the game more fun to use
// Some methods and functions could be used in a better way and not separated from each other
// We have nearly only used if statement and loops (if you have some solutions that would do things better
// it would be appreciated!
// That was all, hope you enjoy Dragon Treasure


// This is the main class that runs the game
public class CaveMaster extends Cave {
    public static void main(String[] args){
        new Cave().welcomeRun();
        new Cave().playgameRun();
    }
}

