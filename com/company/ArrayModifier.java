package com.company;
import java.util.*;

public class ArrayModifier {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

        while(true){
            String command = sc.nextLine();

            if(command.equals("end")){
                for(int i = 0; i < array.length; i++){
                    if(i == array.length - 1){
                        System.out.print(array[i]);
                    }
                    else{
                        System.out.print(array[i] + ", ");
                    }
                }
                break;
            }
            else if(command.startsWith("swap")){
                String[] commandArray = command.split(" ");
                int index1 = Integer.parseInt(commandArray[1]);
                int index2 = Integer.parseInt(commandArray[2]);

                int itemAtIndex1 = array[index1];
                int itemAtIndex2 = array[index2];

                array[index1] = itemAtIndex2;
                array[index2] = itemAtIndex1;
            }
            else if(command.startsWith("multiply")){
                String[] commandArray = command.split(" ");
                int index1 = Integer.parseInt(commandArray[1]);
                int index2 = Integer.parseInt(commandArray[2]);

                int itemAtIndex1 = array[index1];
                int itemAtIndex2 = array[index2];

                int multipliedNumber = itemAtIndex1 * itemAtIndex2;
                array[index1] = multipliedNumber;
            }
            else if(command.equals("decrease")){
                for(int i = 0; i < array.length; i++){
                    array[i] -= 1;
                }
            }
        }
    }
}
