package com.company;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String arrayOne = sc.nextLine();
        String[] array1 = arrayOne.split(" ");
        String arrayTwo = sc.nextLine();
        String[] array2 = arrayTwo.split(" ");
        String [] common = new String[array1.length];
        int index = 0;

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array2[j].equals(array1[i])){
                    common[index] = array1[i];
                    index++;
                    break;
                }
            }
        }

        for(String x: common){
            if(x != null){
                System.out.print(x + " ");
            }
        }
    }
}
