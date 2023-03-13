package com.examOn312;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        int count = 0;

        int arr[] = {1, 2, 4, 6, 7, 9, 10};
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number between 1-10 to check if present in list of array : ");
        int num = scan.nextInt();
        if (num >= 0 && num <= 10) {

            for (int a = 0; a < arr.length; a++) {
                if (arr[a] == num) {
                    count++;

                }
            }

            if (count > 1) {
                System.out.println("the number you have entered is in the array ");
                System.out.println(Arrays.toString(arr));
            }
        } else {
            System.err.println("the number is not in range");
        }
    }
}