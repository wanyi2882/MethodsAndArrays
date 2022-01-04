package com.company;
import java.util.*;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int even = 0;
        int odd = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even += numbers[i];
            }
            else{
                odd += numbers[i];
            }
        }
        System.out.println(even - odd);
    }
}
