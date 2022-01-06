package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> listInteger = Arrays.stream(sc.nextLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        Collections.sort(listInteger);
        Collections.reverse(listInteger);

        List<Integer> topFive = new ArrayList<Integer>();

        int sumOfTotal = 0;
        double averageOfTotal = 0;

        for(int x : listInteger){
            sumOfTotal += x;
        }

        averageOfTotal = sumOfTotal / (double) listInteger.size();

        for(int i = 0; i < Math.min(5, listInteger.size()); i++){
            if(listInteger.get(i) > averageOfTotal){
                topFive.add(listInteger.get(i));
            }
        }

        if(topFive.size() == 0){
            System.out.println("No");
        }
        else{
            for(int x : topFive){
                System.out.print(x + " ");
            }
        }
    }
}
