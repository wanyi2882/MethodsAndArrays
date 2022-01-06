package com.company;
import java.util.*;

public class SoftUniReception {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        //3 lines with integers, representing the number of people that each of the employees can help per hour.
        int employeeOne = Integer.parseInt(sc.nextLine());
        int employeeTwo = Integer.parseInt(sc.nextLine());
        int employeeThree = Integer.parseInt(sc.nextLine());

        int[] employee = {employeeOne, employeeTwo, employeeThree};

        //Total amount of people as a single integer, each of them is considered as a separate request to be processed.
        int people = Integer.parseInt(sc.nextLine());
        int hours = 0;
        int cycles = 0;

        while(true){
            if(people <= 0){
                System.out.printf("Time needed: %dh.", hours);
                break;
            }

            while(people > 0){
                if((hours + 1) % 4 == 0){
                    hours++;
                }

                for(int i = 0; i < employee.length; i++){
                    people = people - employee[i];
                    if(i == 0){
                        hours++;
                    }
                }

            }
        }
    }
}
