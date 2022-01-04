package com.company;
import java.math.BigDecimal;
import java.util.*;

public class MathPower {
    public static BigDecimal mathPower(BigDecimal number, int power){
        number = number.pow(power);
        return number;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        BigDecimal number = new BigDecimal(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        System.out.println(mathPower(number, power));
    }
}
