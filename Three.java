package com.examOn312;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
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
        System.out.println("enter the number you want to delete :");
        int delNum = scan.nextInt();
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] == delNum) {
                arr[r] = 0;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
