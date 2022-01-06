package com.company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTrain {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());

        while(true){
            String command = sc.nextLine();

            if(command.equals("end")){
                for(int x : wagons){
                    System.out.print(x + " ");
                }
                break;
            }
            else if(command.startsWith("Add")){
                String[] newArray = command.split(" ");
                int newWagon = Integer.parseInt(newArray[1]);
                wagons.add(newWagon);
            }
            else{
                int addToExistingWagon = Integer.parseInt(command);
                for(int i = 0; i < wagons.size(); i++){
                    if(wagons.get(i) + addToExistingWagon <= maxCapacity){
                        wagons.set(i, wagons.get(i) + addToExistingWagon);
                        break;
                    }
                }
            }
        }
    }
}
