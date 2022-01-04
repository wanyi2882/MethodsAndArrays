package com.company;
import java.util.*;

public class Train {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] passengersArray = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            int passengers = Integer.parseInt(sc.nextLine());
            passengersArray[i] = passengers;
            sum += passengers;
        }

        for(int passengers: passengersArray){
            System.out.print(passengers + " ");
        }

        System.out.println("\n"+ sum);
    }
}
