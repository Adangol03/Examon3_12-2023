package com.examOn312;

import java.util.Arrays;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the  element of array:");
        for (int a = 0; a < arr.length; a++) {
            int number = scan.nextInt();
            arr[a] = number;
        }
        System.out.println("the array you have entered is :" + Arrays.toString(arr));

        for (int a = 0; a < arr.length; a++) {
            for (int b = a+1; b < (arr.length - 1); b++) {
                if (arr[a] == arr[b]) {
                    System.out.println("duplicate :"+arr[b]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
