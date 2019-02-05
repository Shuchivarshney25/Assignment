package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                System.out.println("not a prime");
                return;
            }
            i++;
        }
        System.out.println("number is prime");

    }
}