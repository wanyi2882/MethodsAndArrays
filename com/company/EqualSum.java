package com.company;
import java.util.*;

public class EqualSum {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumLeft = 0;
        int sumRight = 0;
        String indexes = "";

        for(int i = 0; i < array.length; i++){
            for(int left = 0; left < i; left++){
                sumLeft+=array[left];
            }
            for(int right = i+1; right < array.length; right++){
                sumRight+=array[right];
            }
            if(sumLeft == sumRight){
                indexes += i + " ";
            }
            sumLeft = 0;
            sumRight = 0;
        }

        if(indexes.length() > 0){
            System.out.print(indexes);
        }
        else{
            System.out.println("no");
        }
    }
}
