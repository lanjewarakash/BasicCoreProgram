package com.blz;

public class PowerOfTwo {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        if (num > 31) {
            System.out.println("Value of number should be less than 31");
        } else {
            System.out.println("{Power of 2^" + num + " = " + (Math.pow(2, num)));

            System.out.println("Printing all power value = " + num);
            for (int i = 1; i <= num; i++) {
                System.out.println("Power of 2^" + i + " = " + (Math.pow(2, i)));
            }
        }
    }
}
