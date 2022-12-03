package com.blz;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The no. " + n + " is even");
        } else {
            System.out.println("The no. " + n + " is odd");
        }
    }
}
