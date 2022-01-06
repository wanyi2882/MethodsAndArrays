package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        //Journal containing items, separated by ", " (comma and space)
        List<String> journal = Arrays.stream(sc.nextLine().split(", "))
                                .map(String::new)
                                .collect(Collectors.toList());

        while (true){
            String command = sc.nextLine();

            if(command.equals("Craft!")){
                System.out.print(journal.get(0));
                for(int j = 1; j < journal.size(); j++){
                    System.out.print(", " + journal.get(j));
                }
                break;
            }

            else{
                // The commands are split by " - " (space dash space)
                String[] commandArray = command.split(" - ");
                String step = commandArray[0];
                String item = commandArray[1];

                if(step.equals("Collect")){
                    //"Collect - {item}":
                    // Receiving this command, you should add the given item to your inventory
                    int countNotExist = 0;

                    for(int i = 0; i < journal.size(); i++){
                        if(!journal.get(i).equals(item)){
                            countNotExist++;
                        }
                    }

                    if(countNotExist == journal.size()){
                        journal.add(item);
                    }
                }
                else if(step.equals("Drop")){
                    //"Drop - {item}":
                    // You should remove the item from your inventory, if it is present in the inventory

                    for(int i = 0; i < journal.size(); i++){
                        if(journal.get(i).equals(item)){
                            journal.remove(i);
                            break;
                        }
                    }
                }
                else if(step.equals("Combine Items")){
                    //"Combine Items - {oldItem}:{newItem}":
                    // You should check if the old item is present, if so, place the new item after the old one
                    String[] combine = item.split(":");
                    String oldItem = combine[0];
                    String newItem = combine[1];

                    for(int i = 0; i < journal.size(); i++){
                        if(journal.get(i).equals(oldItem)){
                            journal.add(i+1, newItem);
                            break;
                        }
                    }
                }
                else if(step.equals("Renew")){
                    //"Renew - {item}":
                    // If the given item exists, you should change its position and put it at the last position in your inventory
                    for(int i = 0; i < journal.size(); i++){
                        if(journal.get(i).equals(item)){
                            journal.remove(i);
                            journal.add(item);
                            break;
                        }
                    }
                }
            }
        }
    }
}
