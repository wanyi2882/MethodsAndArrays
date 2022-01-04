package com.company;
import java.util.*;

public class MultipleOddByEven {
    public static int evenSum(String numbers){
        int sumEven = 0;
        for(int i = 0; i < numbers.length(); i++){
            if(numbers.charAt(i) != '-'){
                int digits = Integer.parseInt(numbers.charAt(i) + "");
                if(digits % 2 == 0){
                    sumEven+=digits;
                }
            }
        }
        return sumEven;
    }

    public static int oddSum(String numbers){
        int sumOdd = 0;
        for(int i = 0; i < numbers.length(); i++){
            if(numbers.charAt(i) != '-'){
                int digits = Integer.parseInt(numbers.charAt(i) + "");
                if(digits % 2 != 0){
                    sumOdd+=digits;
                }
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(evenSum(input) * oddSum(input));
    }
}
