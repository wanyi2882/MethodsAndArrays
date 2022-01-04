package com.company;
import java.util.*;

public class ZigZagArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] arrayOne = new int[n];
        int [] arrayTwo = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++){
            int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            if(i == 0 || i % 2 == 0){
                arrayOne[index] = array[0];
                arrayTwo[index] = array[1];
                index++;
            }
            else{
                arrayOne[index] = array[1];
                arrayTwo[index] = array[0];
                index++;
            }
        }

        for(int x : arrayOne){
            System.out.print(x + " ");
        }

        System.out.print("\n");

        for(int x: arrayTwo){
            System.out.print(x + " ");
        }
    }
}
