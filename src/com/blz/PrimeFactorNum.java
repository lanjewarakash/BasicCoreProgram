package com.blz;

import java.util.Scanner;

public class PrimeFactorNum {
    public static void main(String[] args) {

        System.out.println("Enter the no.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
    }
}
