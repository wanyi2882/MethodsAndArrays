package com.company;
import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(sc.nextLine());

        int[] newArray = new int[array.length];
        int index = 0;

        for(int i = 0; i < newArray.length; i++){
            if(n + i >= array.length){
                newArray[i] = array[index];
                index++;
            }
            else{
                newArray[i] = array[n+i];
            }
        }

        for(int x: newArray){
            System.out.print(x + " ");
        }
    }
}
