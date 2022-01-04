package com.company;
import java.util.*;

public class GetMax {
    public static int getMax(int one, int two){
        if(one > two){
            return one;
        }
        else{
            return two;
        }
    }

    public static char getMax(char one, char two){
        if(one > two){
            return one;
        }
        else{
            return two;
        }
    }

    public static String getMax(String one, String two){
        int comparision = one.compareTo(two);
        if (comparision > 0){
            return one;
        }
        else{
            return two;
        }
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        switch(type){
            case "char":
                char oneChar = sc.nextLine().charAt(0);
                char twoChar = sc.nextLine().charAt(0);
                System.out.print(getMax(oneChar, twoChar));
                break;

            case "int":
                int oneInt = Integer.parseInt(sc.nextLine());
                int twoInt = Integer.parseInt(sc.nextLine());
                System.out.print(getMax(oneInt, twoInt));
                break;

            case "string":
                String oneString = sc.nextLine();
                String twoString = sc.nextLine();
                System.out.print(getMax(oneString, twoString));
                break;
        }
    }
}
