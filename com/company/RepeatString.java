package com.company;
import java.util.*;

public class RepeatString {
    public static String repeatString(String word, int count){
        String result = "";
        for(int i = 0; i < count; i++){
            result += word;
        }
        return result;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(word, count));
    }
}
