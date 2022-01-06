package com.company;
import java.util.*;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void checkPassword(String password){
        int error = 0;

        if(!(password.length() >= 6 && password.length() <=10)){
            error++;
            System.out.println("Password must be between 6 and 10 characters");
        }

        for(int i = 0; i < password.length(); i++){
            String character = String.valueOf(password.charAt(i));
            if(!Pattern.matches("\\w", character)){
                error++;
                System.out.println("Password must consist only of letters and digits");
            }
        }

        int count = 0;
        for(int i = 0; i < password.length(); i++){
            String character = String.valueOf(password.charAt(i));
            if(Pattern.matches("\\d", character)){
                count++;
            }
        }
        if(count < 2){
            error++;
            System.out.println("Password must have at least 2 digits");
        }

        if(error == 0){
            System.out.println("Password is valid");
        }
    }


    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        checkPassword(input);

    }
}
