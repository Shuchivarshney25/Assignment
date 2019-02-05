package com.codingblocks.Lecture6;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //print(line);
        //substring(line);
        System.out.println(Palindrome(line));


    }

    public static void print(String line) {
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
    public static void substring(String line){
        for (int i = 0; i <line.length() ; i++) {
            for (int j = i+1; j <=line.length() ; j++) {
                System.out.println(line.substring(i,j));
            }
        }
    }
    public static boolean Palindrome(String line){
        for (int i = 0; i <line.length()/2 ; i++) {
            if(line.charAt(i)!= line.charAt(line.length()-1-i))
            return false;
        }
        return true;
    }

}


