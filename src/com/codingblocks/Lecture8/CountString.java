package com.codingblocks.Lecture8;

public class CountString {
    public static void main(String[] args) {
        String str="abababababacc";
        String n =countstringfun(str);
        System.out.println(n);
    }
    public static String countstringfun(String str){
     int[] freq= new int[26];
        for (int i = 0; i <str.length() ; i++) {
            int v= str.charAt(i)-'a';
            freq[v]++;
        }
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i <freq.length ; i++) {
            for (int j = 0; j <freq[i] ; j++) {
                builder.append((char)(i+'a'));
            }

        }
        return builder.toString();
    }
}
