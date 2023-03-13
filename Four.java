package com.examOn312;

import java.util.Arrays;
import java.util.Scanner;
//Write a Java program to copy an array by iterating the array
public class Four {
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
        int copyArray[]=new int[arr.length];
        for(int a=0; a< arr.length;a++){
            copyArray[a]=arr[a];
        }
        System.out.println("the copy of array is :"+Arrays.toString(copyArray));
    }
}
