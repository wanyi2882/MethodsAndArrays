package com.company;
import java.util.*;

public class Elevator {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        if(n % p == 0){
            System.out.print(n / p);
        }
        else{
            System.out.print((n / p)  + 1 );
        }
    }
}
