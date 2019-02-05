package com.codingblocks.Lecture7;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean result = pallindrome(s);
    System.out.println( result);

}

    public static boolean pallindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}