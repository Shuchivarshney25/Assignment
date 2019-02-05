package com.codingblocks.Lecture7;

public class OddEven {
    public static void main(String[] args) {

    }
    public static String evenoddfun(String str){
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);

            builder.append(ch);
        }
        return builder.toString();
    }
}
