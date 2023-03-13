package com.examOn312;

import java.util.Arrays;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, n1;

        System.out.println("Enter the size 1st of array :");
        n = scan.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter the  element of 1st array:");
        for (int a = 0; a < arr.length; a++) {
            String element = scan.next();
            arr[a] = element;

        }

        System.out.println("Enter the size of 2nd array :");
        n1 = scan.nextInt();
        String arr1[] = new String[n1];
        System.out.println("Enter the  element of 2nd array:");
        for (int a = 0; a < arr1.length; a++) {
            String element = scan.next();
            arr1[a] = element;



        }
        if (n == n1) {
            for (int a = 0; a < arr.length; a++) {
                for (int b = a + 1; b < (arr1.length - 1); b++) {
                    if (arr[a].equalsIgnoreCase(arr1[b]) ) {
                        System.out.println("duplicate :" + arr[a]);
                        break;
                    }
                }

            }
        }else{
            System.out.println("the size of array is not equal");
        }
        System.out.println("the element you have entered is :" + Arrays.toString(arr));
        System.out.println("the element you have entered is :" + Arrays.toString(arr1));
    }
}