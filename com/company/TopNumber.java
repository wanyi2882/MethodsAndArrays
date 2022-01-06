package com.company;
import java.util.*;

public class TopNumber {
    //Its sum of digits is divisible by 8, e.g. 8, 17, 88
    public static boolean sumDivisibleByEight(int number){
        boolean b = false;
        int sum = 0;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++){
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        if(sum % 8 == 0){
            b = true;
        }
        return b;
    }

    //Holds at least one odd digit, e.g. 232, 707, 87578
    public static boolean oddDigit(int number){
        boolean b = false;
        int oddCount = 0;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++){
            if(Integer.parseInt(String.valueOf(numberString.charAt(i))) % 2 != 0){
                oddCount++;
                break;
            }
        }
        if(oddCount == 1){
            b = true;
        }
        return b;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int integer = Integer.parseInt(sc.nextLine());

        for(int number = 1; number <= integer; number++){
            if(sumDivisibleByEight(number) && oddDigit(number)){
                System.out.println(number);
            }
        }
    }
}
