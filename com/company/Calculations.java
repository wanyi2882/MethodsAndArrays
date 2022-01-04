package com.company;
import java.util.*;

public class Calculations {
    public static void add(int a, int b){
        System.out.print(a + b);
    }

    public static void subtract(int a, int b){
        System.out.print(a - b);
    }

    public static void multiply(int a, int b){
        System.out.print(a * b);
    }

    public static void divide(int a, int b){
        System.out.print(a / b);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if(input.equals("add")){
            add(a, b);
        }
        else if(input.equals("subtract")){
            subtract(a, b);
        }
        else if(input.equals("multiply")){
            multiply(a, b);
        }
        else if(input.equals("divide")){
            divide(a, b);
        }
    }
}
