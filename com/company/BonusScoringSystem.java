package com.company;
import java.util.*;

public class BonusScoringSystem {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(sc.nextLine());

        int numberOfLectures = Integer.parseInt(sc.nextLine());

        int additionalBonus = Integer.parseInt(sc.nextLine());

        double highestBonus = 0;
        int maxAttendance = 0;

        for(int i = 0; i < numberOfStudents; i++){
            int attendance = Integer.parseInt(sc.nextLine());

            double totalBonus = attendance / (double) numberOfLectures * (5 + additionalBonus);

            if(totalBonus > highestBonus){
                highestBonus = totalBonus;
                maxAttendance = attendance;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(highestBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
