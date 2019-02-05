package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0 && n<0 && n>10){
            int row = 0;
            int k = 0;
            while(k <= 2*n-1 ){
                int col = 0;
                while(col <= n - row -1 ){
                    System.out.print("  ");
                    col++;
                }
                col=0;
                while(col < 2 * row + 1 ){
                    System.out.print("*"+" ");
                    col++;
                }
                if(k<n-1){
                    row++;
                }else{
                    row--;
                }
                System.out.println();
                k++;

            }

        }else{
            System.out.println("cannot display");
        }




    }
}
