package com.codingblocks.Lecture7;
import java.util.Scanner;

public class SubstringString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "baab";
        System.out.println(substring(str));
    }
    public static int substring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 & right < str.length()) {
                if (str.charAt(left--) == str.charAt(right++)) {
                    count++;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i+1;
            while (left >= 0 & right < str.length()) {
                if (str.charAt(left--) == str.charAt(right++)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
