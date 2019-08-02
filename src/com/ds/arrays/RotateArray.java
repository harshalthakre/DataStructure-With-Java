package com.ds.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Input Array: ");
        ArrayUtils.inputArray(arr);
        System.out.println("Array Before Rotation");
        ArrayUtils.printArray(arr);
        System.out.println("Input rotating factor");
        int d=sc.nextInt();

        System.out.println("Array After Rotation");
        arr=rotateArrayWithExtraSpace(arr,d);
        ArrayUtils.printArray(arr);

    }

    private static int[] rotateArrayWithExtraSpace(int[] arr, int d) {
        int rotatedArray[]=new int[arr.length];
        int i=d;
        int j=0;
        while(i!=d-1){
            rotatedArray[j]=arr[i];
            i=(i+1)%arr.length;
            j++;
        }
        rotatedArray[j]=arr[i];
        return rotatedArray;
    }
}
