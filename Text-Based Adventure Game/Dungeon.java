import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //Percentage

        System.out.println("\nWelcome to the Dungeon Game");
        GAME:
        while(true) {
            System.out.println("---------------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #");

            while(enemyHealth > 0) {
                System.out.println("\n\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
                int choice = input.nextInt();

                if(choice == 1) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation.");

                    if(health < 1) {
                        System.out.println("\n\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                } else if(choice == 2) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink the health potion, healing yourself for "
                                + healthPotionHealAmount + "." + "\n\t> You now have " + health + " HP." +
                                "\n\t> You have " + numHealthPotions + " health potions left.");

                    } else {
                        System.out.println("\t> You have no health potions left! " +
                                "Defeat enemies for a chance to get one!");
                    }
                } else if(choice == 3) {
                    System.out.println("\t> You ran away from the " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("\tInvalid command!");
                }
            }
            if(health < 1) {
                System.out.println("\nYou limp out of the dungeon, weak from battle.");
                break;
            }
            System.out.println("\n---------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left # ");

            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println("\n # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # you have " + numHealthPotions + " health potions. #  ");
            }

            System.out.println("---------------------------------------");
            System.out.println("\nWhat would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");
            int ch = input.nextInt();
            while(ch != 1 && ch !=2) {
                System.out.println("Invalid command!");
                ch = input.nextInt();
            }

            if(ch == 1) {
                System.out.println("\nYou continue on your adventure!");
            } else {
                System.out.println("\nYou exit the dungeon, successful from your adventure!");
                break;
            }
        }

        System.out.println("\n################################");
        System.out.println("\t# THANKS FOR PLAYING #");
        System.out.println("################################");
    }
}
