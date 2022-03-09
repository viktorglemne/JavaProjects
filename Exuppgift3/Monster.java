package Exuppgift3;

import java.util.Random;

public class Monster {

    // Public ints, strings and random that takes information and shows it randomly
    // being used in different classes
    public static Random rand = new Random();
    public static String[] enemiesRegular = {"Zombie", "Skeleton", "Warrior", "Ghost", "Goblin", "Orc", "Black Elf"};
    public static String enemiesDragon = "Dragon";
    public static int maxEnemyRegularHealth = 8;
    public static int maxEnemyDragonHealth = 18;
    public static int enemyAttackDamage = 3;
    public static String enemy = enemiesRegular[rand.nextInt(enemiesRegular.length)];
    public static int enemyRegularHealth = rand.nextInt(maxEnemyRegularHealth);
    public static int enemyDragonHealth = rand.nextInt(maxEnemyDragonHealth);
}
