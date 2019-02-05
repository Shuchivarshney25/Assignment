package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int odd=0;
        int even=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            even=even+r;
             r=n%10;
             n=n/10;
             odd=odd+r;
        }
        System.out.println("Addition of even number :- "+even);
        System.out.println("Addition of odd number :-"+odd);
    }
}
