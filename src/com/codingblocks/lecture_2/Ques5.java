package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int temp;
        while(n-1>0) {
            System.out.println(a);
            temp = b;
            b = a + b;
            a = temp;
            n = n - 1;
        }
    }
}
