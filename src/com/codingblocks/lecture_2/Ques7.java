package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row = 0;
        int var =1;
        while (row<n) {
            int col = 0;
            while (col <= row) {
                System.out.print(var+" ");
                col++;
                var++;

            }
            System.out.println();
            row++;
        }
    }
}
