package com.company;
import java.util.*;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();


        for(int i = start; i <= end; i++){
            char input = (char) i;
            System.out.print(input + " ");
        }
    }
}
