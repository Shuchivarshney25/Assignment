package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=100){
            int row = 0;
            int first=0;
            int second=1;
            while (row < n) {
                int col = 0;
                while (col <=row) {
                    System.out.print(first+" ");
                    int temp=second;
                    second=first+second;
                    first=temp;
                    col++;
                }
                System.out.println();
                row++;
            }

        }else{
            System.out.println("no output");
        }
        }

}
