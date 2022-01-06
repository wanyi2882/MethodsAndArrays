package com.company;
import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<String> products = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String product = sc.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for(int j = 1; j <= n; j++){
            System.out.printf("%d.%s%n", j, products.get(j-1));
        }
    }
}
