package com.codingblocks.Lecture7;

public class StringBuilderEx {
    public static void main(String[] args) {
        String line="hello";
        StringBuilder builder= new StringBuilder(line);
        for (int i = 0; i <1000000 ; i++) {
            builder.append("a");
        }
        for (int i = 0; i <builder.length() ; i+=2) {
            builder.insert(i+1, '_');
        }
        System.out.println(builder);

    }
}
