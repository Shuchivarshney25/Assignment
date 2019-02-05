package com.codingblocks.lecture_2;
import java.util.Scanner;
public class Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1 ; i <=n ; i--) {
            if (n % 2 == 0) {
                System.out.println(i);
            }
        }
            for (int i = n; i <= 0; i++) {
                if (n % 2 != 0) {
                    System.out.println(i);
                }
            }
    }
}




