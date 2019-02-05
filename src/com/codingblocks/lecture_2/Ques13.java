package com.codingblocks.lecture_2;
import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        switch (ch) {
            case '*':
                System.out.println(first * second);
                break;
            case '+':
                System.out.println(first + second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            case '%':
                System.out.println(first % second);
            case 'x':
            case 'X':
                return;
            default:
                System.out.println("Invalid operation, Try again");

        }
    }
}
