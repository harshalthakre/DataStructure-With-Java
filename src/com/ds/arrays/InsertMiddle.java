package com.ds.arrays;

import java.util.Scanner;

public class InsertMiddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size.....");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter Array Element.....");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for (int element:
             arr) {
            System.out.print(element+" ");
        }
        System.out.println("Enter Position..");
        int pos=sc.nextInt();
        System.out.println("Enter data.......");
        int data=sc.nextInt();
        pos=pos-1;
        int temp=arr[pos];
        arr[pos]=data;
        for(int i=pos+1;i<n+1;i++){
            int atemp=arr[i];
            arr[i]=temp;
            temp=atemp;
        }

        System.out.println("After Swapping ...........");
        for (int element:
             arr) {
            System.out.print(element+" ");
        }
    }
}
