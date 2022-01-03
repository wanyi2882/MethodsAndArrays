package com.company;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int highestSnowballValue = 0;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for(int i = 0; i < N; i++){
            int snowballSnow = sc.nextInt();
            int snowballTime = sc.nextInt();
            int snowballQuality = sc.nextInt();
            int currentSnowballValue = snowballSnow / snowballTime;
            int power = snowballSnow / snowballTime;

            for(int j = 0; j < snowballQuality - 1; j++){
                currentSnowballValue = currentSnowballValue * power;
            }

            if(currentSnowballValue > highestSnowballValue){
                highestSnowballValue = currentSnowballValue;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", snow, time, highestSnowballValue, quality);
    }
}
