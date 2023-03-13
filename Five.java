package com.examOn312;

import java.util.Arrays;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int kati = scan.nextInt();

        int a[] = new int[kati];

        System.out.println("Enter the numbers ");
        for (int i = 0; i < a.length; i++)
            a[i] = scan.nextInt();
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
            if (a[i] < min) {
                min = a[i];
                break;
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println("the max value is :" + max);
        System.out.println("the min value is :" + min);
    }
}
