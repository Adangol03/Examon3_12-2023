package com.examOn312;


import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = scan.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the  element of array:");
        for (int a = 0; a < arr.length; a++) {
            int number = scan.nextInt();

              arr[a] =number;
            sum = sum + number;

        }
        System.out.println("the average of array is :"+(sum/arr.length));
        System.out.println("the array you have entered is :"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));


    }
}
