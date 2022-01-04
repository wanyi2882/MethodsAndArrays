package com.company;
import java.util.*;

public class Orders {
    public static double totalPrice(String order, int quantity){
        double sum = 0;
        if(order.equals("coffee")){
            sum = 1.50 * quantity;
        }
        else if(order.equals("water")){
            sum = 1.00 * quantity;
        }
        else if(order.equals("coke")){
            sum = 1.40 * quantity;
        }
        else if(order.equals("snacks")){
            sum = 2.00 * quantity;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String order = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f", totalPrice(order, quantity));

    }
}
