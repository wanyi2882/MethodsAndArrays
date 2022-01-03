package com.company;
import java.util.*;

public class IntegerOperations {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();

        System.out.print((first + second)/third * fourth);
    }
}
