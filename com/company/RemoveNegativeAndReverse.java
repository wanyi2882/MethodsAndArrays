package com.company;
import java.util.*;
import java.util.stream.Collectors;


public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 0){
                list.remove(i);
                i--;
            }
        }

        Collections.reverse(list);

        if(list.size() == 0){
            System.out.println("empty");
        }
        else{
            for(int x : list){
                System.out.print(x + " ");
            }
        }
    }
}
