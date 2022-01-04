package com.company;
import java.util.*;

public class LadyBug {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        int[] field = new int[size];

        int[] bugs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for(int x : bugs){
            field[x] = 1;
        }

        while(true){
            String command = sc.nextLine();

            if(command.equals("end")){
                break;
            }
            else{
                String[] commandArray = command.split(" ");

                int initialPosition = Integer.parseInt(commandArray[0]);
                String direction = commandArray[1];
                int moves = Integer.parseInt(commandArray[2]);

                field[initialPosition] = 0;
                if(direction.equals("left")){
                    for(int i = initialPosition; i >= 0; i -= moves){
                        if(i - moves < 0){
                            break;
                        }
                        if(field[i - moves] == 0){
                            field[i - moves] = 1;
                            break;
                        }
                    }
                }
                else if(direction.equals("right")){
                    for(int i = initialPosition; i < field.length; i += moves){
                        if(i + moves >= field.length){
                            break;
                        }
                        if(field[i + moves] == 0) {
                            field[i + moves] = 1;
                            break;
                        }
                    }
                }
            }
        }

        for(int y : field){
            System.out.print(y + " ");
        }
    }
}
