package com.ds.stack;

public class StackApplication {
    public static void main(String[] args) {
        int arr[][]=new int[][]{
                {1,2,3},
                {4,5,6}
        };
        for (int[] element:
             arr) {
            for (int data:
                 element) {
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
