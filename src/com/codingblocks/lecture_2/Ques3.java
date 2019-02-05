package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            result=(result*10)+r;
        }
        System.out.println("Reverse of  a number :-"+result);
    }
}
