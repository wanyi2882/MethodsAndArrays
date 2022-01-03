package com.company;
import java.util.*;

public class SpiceMustFlow {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int startingYield = sc.nextInt();
        int yield = startingYield;
        int sumOfYield = 0;
        int days = 0;

        while(true){
            days++;
            sumOfYield += yield - 26;
            yield -= 10;

            if(yield < 100){
                sumOfYield -= 26;
                System.out.println(days);
                System.out.println(sumOfYield);
                break;
            }
        }


    }
}
