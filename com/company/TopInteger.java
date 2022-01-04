package com.company;
import java.util.*;

public class TopInteger {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String top = "";

        for(int i = 0; i < array.length; i++){
            int count = 0;

            for(int j = i + 1; j < array.length; j++){

                if(array[i] > array[j]){
                    count++;
                }

                if(count == array.length - i - 1){
                    top += array[i] + " ";
                }
            }

            if(i == array.length - 1){
                top += array[i];
            }
        }
        System.out.print(top);
    }
}
