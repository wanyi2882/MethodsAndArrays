package com.company;
import java.util.*;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        if(numbers.length == 1){
            System.out.println(numbers[0]);
        }
        else{
            while(numbers.length != 1){
                int[] array = new int[numbers.length - 1];

                for(int i = 0; i < array.length; i++){
                    array[i] = numbers[i] + numbers[i+1];
                }
                numbers = array;
            }
            System.out.println(numbers[0]);
        }
    }
}
