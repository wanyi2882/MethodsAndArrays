package com.company;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


public class SumAdjacentEqualNumbers {
    public static String join(List<Double> items, String delimiter){
        String output = "";
        for(Double item : items){
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }

        return output;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for(int i = 0; i < numbers.size() - 1; i++){
            if(numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i, numbers.get(i) + numbers.get(i+1));
                numbers.remove(i+1);
                i = -1;
            }
        }

        String output = join(numbers, " ");

        System.out.println(output);



    }
}
