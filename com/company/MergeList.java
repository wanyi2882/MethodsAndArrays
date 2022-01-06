package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class MergeList {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> numsOne = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numsTwo = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < Math.min(numsOne.size(), numsTwo.size()); i++){
            newArray.add(numsOne.get(i));
            newArray.add(numsTwo.get(i));
        }
        if(numsOne.size() > numsTwo.size()){
            for(int i = numsTwo.size(); i < numsOne.size(); i++){
                newArray.add(numsOne.get(i));
            }
        }
        else{
            for(int i = numsOne.size(); i < numsTwo.size(); i++){
                newArray.add(numsTwo.get(i));
            }
        }

        for(int x : newArray){
            System.out.print(x + " ");
        }
    }
}
