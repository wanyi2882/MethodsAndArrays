package com.company;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesNumber = Integer.parseInt(scanner.nextLine());
        int waterTankCapacity = 255;
        int litresCounter = 0;

        for (int i = 1; i <= linesNumber; i++) {
            int waterLiters = Integer.parseInt(scanner.nextLine());
            waterTankCapacity -= waterLiters;

            if (waterTankCapacity < 0) {
                waterTankCapacity += waterLiters;
                litresCounter -= waterLiters;
                System.out.println("Insufficient capacity!");
            }

            litresCounter += waterLiters;
        }
        System.out.println(litresCounter);
    }
}
