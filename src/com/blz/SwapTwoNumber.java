package com.blz;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of x and y:");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.println("Before swap no:"+x+" "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swap no:"+x+" "+y);
    }
}
