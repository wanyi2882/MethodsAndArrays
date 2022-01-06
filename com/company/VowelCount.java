package com.company;
import java.util.*;

public class VowelCount {
    public static int count(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(count(input));
    }
}
