package tutorials; //packages: organizing java files together
import java.util.Scanner;
import java.util.Random;
public class Main {
    
    /*
    enum Animal {
        CAT, DOG, PIG, SHEEP;
    }
    */
    
    public static void main(String[] args) {
        
        //Variable Type name ( = value);
        
        /*
        int myNumber = 1000;
        
        System.out.println(myNumber);
        
        myNumber = 19900;
        System.out.println(myNumber);
        
        myNumber = 19901;
        System.out.println(myNumber);
        
        myNumber = 19902;
        System.out.println(myNumber);
        
        myNumber = 19903;
        System.out.println(myNumber);
        */
        
        /**************Mathematical Operations and Primitive Variable Types*****************/
        //Add       +
        //Subtract  -
        //Multiply  *
        //Divide    /
        /*
        int a, b, c, d;
        a = 10;
        b = 20;
        c = (a + b) / 10;
        d = c * b;
        System.out.println(d);
        
        byte    verySmallNumber;
        short   smallNumber; //16-bit number
        int     averageNumber;
        long    largeNumber; //64-bit number
        
        float averageDecimal = 1.023f; //32-bit
        double largeDecimal  = 122.4235;
        
        boolean trueOrFalse = true; //true or false value
        
        char character = 'a';
        */
        
        /**************Boolean Operators & IF Statement*****************/
        // Equal to                  == (checking a value versus = is assigning a value)
        // Greater than              >
        // Less than                 <
        // Greater than/equal to     >=
        // Less than/equal to        <=
        // Not equal to              !=
        // AND                       &&
        // OR                        ||
        
        // if(condition is true) {
        //      do this code
        // }
        
        //boolean a = ((10 - 1 == 8) && (false)) || ((false) && (false));
        /*
        boolean a = true;
        boolean b = false;
        if(b) {
            System.out.println("b is true");
        } else if(a && b) {
            System.out.println("a AND b are true");
        } else if(a || b) {
            System.out.println("a OR b are true");
        } else {
            System.out.println("a AND b are false");
        }
        */
        
        /****************Switch Statements & Enumerations*********************/
        /*
        Animal a = Animal.CAT;
        switch(a) {
            case CAT:
                
                break;
            case DOG:
                
                break;
            case PIG:
                
                break;
            case SHEEP:
                
                break;
            default : 
                System.out.println("Default case.");
        }
        */
        
        /****************While, Do While & For Loops*************************/
        /*
        int a = 0;
        
        while(a < 1000) {
            System.out.println(a);
            a++; //a = a + 1;
        }
        */
        
        /*
        for(int a=0; a<100; a++) {
            System.out.println(a);
        }
        */
        
        /*
        int a = 10;
        do {
            System.out.println("Hello, world!");
        } while(a < 10);
        */
        
        /*****************Arrays**************************/
        //                      0   1   2   3
        /*
        int[]       ages    = { 17, 21, 18, 19 };
        boolean[]   student = new boolean[4];
        student[0] = true;
        student[1] = false;
        student[2] = false;
        student[3] = true;
        
        for(int i=0; i<ages.length; i++) {
            System.out.println(ages[i]);
        }
        */
        
        /****************Strings, String Functions & Chars****************/
        /*
        String message = "Hello, world!";
        //message = message.concat(" Lovely day, isn't it?");
        //message = message.toUpperCase();
        //message = message.replace('o', '0');
        //message = message.replace('e', '3');
        //message = message.replace('l', '1');
        //System.out.println(message);
        
        char[] characters = message.toCharArray();
        
        for(char c : characters) {
            System.out.print(c);
        }
        */
        
        /***************Text-based Adventure Game Project****************/
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        //Game variables
        String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;
        
        //Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //Percentage
        
        boolean running = true;
        
        System.out.println("Welcome to the Dungeon!");
        
        GAME:
        while(running) {
            System.out.println("--------------------------------------------------");
            
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");
            
            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
                
                String input = in.nextLine();
                if(input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);
                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");
                    if(health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                } else if(input.equals("2")) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
                                + "\n\t> You now have " + health + " HP."
                                + "\n\t> You have " + numHealthPotions + " health potions left.\n");
                    } else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
                    }
                } else if(input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("\tInvalid command!");
                }
            }
            if(health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }
            
            System.out.println("--------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. # ");
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("--------------------------------------------------");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");
            
            String input = in.nextLine();
            
            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            }
            
            if(input.equals("1")) {
                System.out.println("You continue on your adventure!");
            } else if(input.equals("2")) {
                System.out.println("You exit the dungeon, successful from your adventures!");
                break;
            }
        }
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
    }
}