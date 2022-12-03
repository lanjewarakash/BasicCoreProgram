package com.blz;

import java.util.Scanner;

public class HarmonicNumber {
        public static void main(String[] args) {
            double result=0;
            int i;
            System.out.println("Enter the no. ");
            Scanner scan = new Scanner(System.in);
            int num=scan.nextInt();
            for (i=1;i<=num;i++)
            {
                result=result+(double) 1/i;
                System.out.println("The value of harmonic no. " + num + "is = "+result);
            }
        }
    }
