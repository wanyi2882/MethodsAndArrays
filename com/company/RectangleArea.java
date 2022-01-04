package com.company;
import java.util.*;

public class RectangleArea {
    public static int area(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        System.out.println(area(width, height));

    }
}
