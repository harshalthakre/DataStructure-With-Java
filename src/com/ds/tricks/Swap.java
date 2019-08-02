package com.ds.tricks;

import com.ds.arrays.ArrayUtils;

public class Swap {
    public static void main(String[] args) {
        Integer a=new Integer(5);
        Integer b=new Integer(4);
        System.out.println("Before Swap");
        System.out.println("a: "+a+" b: "+b);
        swap(a,b);
        System.out.println("After Swap");
        System.out.println("a: "+a+" b: "+b);
    }

    private static void swap(Integer a, Integer b) {
        Integer temp=a.intValue();
        a=new Integer(b.intValue());
        b=new Integer(temp.intValue());
    }
}