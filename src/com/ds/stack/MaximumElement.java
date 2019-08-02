package com.ds.stack;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Stack<Long> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        long itr=sc.nextLong();
        int query=0;
        long data=0;
        for(long i=0;i<itr;i++){
            query=sc.nextInt();
            switch (query){
                case 1: stack.push(sc.nextLong()); break;
                case 2: stack.pop(); break;
                case 3: System.out.println(Collections.max(stack,new Comparator<Long>(){
                    @Override
                    public int compare(Long o1, Long o2) {
                        if(o1>o2) return 1;
                        else if(o1<02) return -1;
                        else return 0;
                    }
                })); break;
            }
        }
    }
}
