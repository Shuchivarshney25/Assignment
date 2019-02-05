package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int row = 0;
        while (row <4) {
            int col = 0;
            while (col <= row) {
                System.out.print(1 + col + " ");
                col++;
            }


            System.out.println();
            row++;


      }

    }
}
