package com.company;
import java.util.*;

public class LadybugExample {
    public static void main(String[] args) {
        // Write code here

        Scanner in = new Scanner(System.in);
        //Create empty field
        int size = Integer.parseInt(in.nextLine());
        int[] emptyField = new int[size];
        int[] newField = emptyField;
        //Finding starting position of ladybugs
        int[] startingLadybug = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int i : startingLadybug){
            newField[i] = 1;
        }

        //Testing newField array
        /*
        for (int i = 0; i < newField.length; i++) {
            System.out.print(newField[i] + " ");

        }
        */

        String command = in.nextLine();
        while (!command.equals("end")){
            String[] newCommand = command.split(" ");
            //Receives inputs until command "end" is given
            int ladybugIndex = Integer.parseInt(newCommand[0]);
            String direction = newCommand[1];
            int flyLength = Integer.parseInt(newCommand[2]);

            //If ladybugIndex has no ladybugs or out of field range, requests a new command
            if (newField[ladybugIndex] == 0 || ladybugIndex >= newField.length){
                command = in.nextLine();
            }
            //If right-flying ladybug flies out of field, replace ladybug position with 0
            if ((ladybugIndex + flyLength >= newField.length) && direction.equals("right")){
                newField[ladybugIndex] = 0;
                command = in.nextLine();
            }
            //If left-flying ladybug flies out of field, replace ladybug position with 0
            else if ((ladybugIndex - flyLength < 0) && direction.equals("left")){
                newField[ladybugIndex] = 0;
                command = in.nextLine();
            }
            //New position for right-flying ladybug if landing on empty space
            if ((newField[ladybugIndex] == 1) && direction.equals("right")){
                int newIndex = ladybugIndex + flyLength;
                while (newField[newIndex] == 1){
                    newIndex += flyLength;
                    if (newIndex >= newField.length){
                        newField[ladybugIndex] = 0;
                        command = in.nextLine();
                        break;
                    }
                    else if (newField[newIndex] == 0){
                        newField[newIndex] = 1;
                        newField[ladybugIndex] = 0;
                        command = in.nextLine();
                        break;
                    }
                }
            }
            //New position for left-flying ladybug if landing on empty space
            if ((newField[ladybugIndex] == 1) && direction.equals("left")){
                int newIndex = ladybugIndex - flyLength;
                while (newField[newIndex] == 1){
                    newIndex -= flyLength;
                    if (newIndex < 0){
                        newField[ladybugIndex] = 0;
                        command = in.nextLine();
                        break;
                    }
                    else if (newField[newIndex] == 0){
                        newField[newIndex] = 1;
                        newField[ladybugIndex] = 0;
                        command = in.nextLine();
                        break;
                    }
                }
            }
        }
        //Print out newField when command "end" is given

        if (command.equals("end")){
            for (int i = 0; i < newField.length; i++){
                System.out.print(newField[i] + " ");
            }
        }
    }
}
