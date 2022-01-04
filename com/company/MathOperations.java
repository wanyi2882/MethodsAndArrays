package com.company;
import java.util.*;

public class MathOperations {
    public static int calculate(String operator, int numberOne, int numberTwo){
        int result = 0;

        switch(operator){
            case "/":
                result = numberOne / numberTwo;
                break;

            case "*":
                result = numberOne * numberTwo;
                break;

            case "+":
                result = numberOne + numberTwo;
                break;

            case "-":
                result = numberOne - numberTwo;
                break;
        }

        return result;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int one = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int two = Integer.parseInt(sc.nextLine());

        System.out.println(calculate(operator, one, two));

    }
}
