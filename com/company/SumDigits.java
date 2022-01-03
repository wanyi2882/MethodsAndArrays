package com.company;
import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int single = sc.nextInt();
        int length = String.valueOf(single).length();
        int sum = 0;
        int numbers = single;

        for(int i = 1; i <= length; i++){
            sum += numbers % 10;
            numbers = numbers / 10;
        }

        System.out.print(sum);
    }
}
