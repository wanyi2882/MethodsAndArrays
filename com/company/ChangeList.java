package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(true){
            String command = sc.nextLine();

            if(command.equals("end")){
                for(int x:list){
                    System.out.print(x + " ");
                }
                break;
            }

            else if(command.startsWith("Delete")){
                String[] array = command.split(" ");
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i) == Integer.parseInt(array[1])){
                        list.remove(i);
                    }
                }
            }
            else if(command.startsWith("Insert")){
                String[] array = command.split(" ");
                int element = Integer.parseInt(array[1]);
                int index = Integer.parseInt(array[2]);

                list.add(index, element);
            }
        }
    }
}
