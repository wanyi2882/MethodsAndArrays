package com.company;
import java.util.*;

public class SumOfChars {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for(int i = 0; i < n; i++){
            char alphabet = sc.nextLine().charAt(0);
            sum += alphabet;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
