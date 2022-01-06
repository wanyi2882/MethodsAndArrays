package com.company;
import java.util.*;

public class MuOnline {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int bitcoin = 0;

        String[] command = sc.nextLine().split("\\|");

        for(int i = 0; i < command.length; i++){
            String[] eachRoom = command[i].split(" ");

            String instruction = eachRoom[0];
            int number = Integer.parseInt(eachRoom[1]);

            if(instruction.equals("potion")){
                int healthPointsRestored = 0;

                if(health + number <= 100){
                    health = health + number;
                    healthPointsRestored = number;
                }
                else if (health + number > 100){
                    healthPointsRestored = 100 - health;
                    health = 100;
                }
                System.out.printf("%d health points restored.%n", healthPointsRestored);
                System.out.printf("Current health: %d hp.%n", health);
                healthPointsRestored = 0;
            }
            else if(instruction.equals("chest")){
                bitcoin += number;
                System.out.printf("You found %d bitcoins.%n", number);
            }
            else{
                //The second value of the room contains the attack points of the monster.
                //You should remove the value of the monster's attack from your health.

                health -= number;

                if(health > 0){
                    System.out.printf("You have slayed a %s.%n", instruction);
                }
                if(health <= 0){
                    System.out.printf("You died! Killed by %s.%n", instruction);
                    System.out.printf("Best room: %d", i+1);
                    break;
                }
            }
        }

        if(health > 0){
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoin, health);
        }
    }
}
