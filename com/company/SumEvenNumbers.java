package com.company;
import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] items = input.split(" ");
        int length = items.length;

        int sum = 0;

        for (int i = 0; i < length; i++) {
            int current = Integer.parseInt(items[i]);

            if (current % 2 == 0) {
                sum += current;
            }
        }

        System.out.println(sum);
    }
}
