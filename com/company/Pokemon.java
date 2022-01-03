package com.company;
import java.util.*;

public class Pokemon {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();
        int pokeCount = 0;
        int currentPower = N;

        while(true){
            if (currentPower >= M){
                pokeCount++;
                currentPower -= M;
            }
            if(N / currentPower * 100 == 50){
                N /= Y;
            }
            else if(currentPower < M){
                System.out.println(currentPower);
                System.out.println(pokeCount);
                break;
            }
        }
    }
}
