package com.codingblocks.Lecture7;

public class Ascii {
    public static void main(String[] args) {
        String s = "Shuchi";
        System.out.println(asciifun(s));
    }
    public static String asciifun(String str){
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i <str.length()-1 ; i++) {
            char present= str.charAt(i);
            char next=str.charAt(i+1);
            builder.append(present);
            builder.append(Math.abs(present-next));
        }
        builder.append(str.charAt(str.length()-1));
        return builder.toString();
    }
}
