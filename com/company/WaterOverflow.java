package com.company;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int capacity = 255;
        int current = 0;
        int n = Integer.parseInt(sc.nextLine());


        for(int i = 0; i < n; i++){
            int litres = Integer.parseInt(sc.nextLine());
            current += litres;
            if(current < capacity && i==0){
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(current);
    }
}
