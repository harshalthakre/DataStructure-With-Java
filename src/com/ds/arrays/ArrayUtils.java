package com.ds.arrays;

import java.util.Scanner;

public class ArrayUtils {
    private static Scanner sc=new Scanner(System.in);
    public static int[] inputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for (int element:
             arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void printer(int ...a){
        for (int data:
             a) {
            System.out.print(a+" ");
        }
    }
}
