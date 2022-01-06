package com.company;
import java.util.*;

public class SmallestOfThree {
    public static void printSmallest(int a, int b, int c){
        if(a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < c){
            System.out.println(b);
        }
        else if(c < a && c < b){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        printSmallest(first, second, third);

    }
}
