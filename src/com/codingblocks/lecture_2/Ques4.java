package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*prime number (Ques 1)*/
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
