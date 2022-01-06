package com.company;
import java.util.*;

public class CharacterInRange {
    public static void printCharInRange(int start, int end){
        String characters = "";

        for(int i = start + 1; i < end; i++){
            char charOne = (char) i;
            characters += charOne + " ";
        }

        System.out.println(characters);
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        char charOne = sc.nextLine().charAt(0);
        char charTwo = sc.nextLine().charAt(0);

        int intOne = 0;
        int intTwo = 0;

        if(charOne < charTwo){
            intOne = charOne;
            intTwo = charTwo;
        }
        else{
            intOne = charTwo;
            intTwo = charOne;
        }

        printCharInRange(intOne, intTwo);

    }
}
