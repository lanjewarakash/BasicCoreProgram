package com.blz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
            int n, headCoin = 0, tailCoin = 0;
            double head, tail;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter times of coin:");
            n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                double random = Math.random();
                if (random < 0.5)
                {
                    System.out.println("tail");
                    tailCoin++;
                } else
                {
                    System.out.println("head");
                    headCoin++;
                }
                head = headCoin / (double) n * 100;
                tail = tailCoin / (double) n * 100;
                System.out.println("percentage of head:" + head + "%");
                System.out.println("percentage of tail:" + tail + "%");
            }
        }
    }
