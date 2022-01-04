package com.company;
import java.util.*;

public class EqualArrays {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String [] firstArray = sc.nextLine().split(" ");
        int[] firstNumberArray = new int[firstArray.length];

        String [] secondArray = sc.nextLine().split(" ");
        int[] secondNumberArray = new int[secondArray.length];

        int sum = 0;

        for(int i = 0; i < firstNumberArray.length; i++){
            firstNumberArray[i] = Integer.parseInt(firstArray[i]);
            secondNumberArray[i] = Integer.parseInt(secondArray[i]);

            if(firstNumberArray[i] != secondNumberArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
                // return will stop the program entirely
            }

            sum += firstNumberArray[i];
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
