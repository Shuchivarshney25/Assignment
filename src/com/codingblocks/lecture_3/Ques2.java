package com.codingblocks.lecture_3;

public class Ques2 {
    public static void main(String[] args) {
     int n= deci2octa(16);
        System.out.println(n);
    }

    public static int deci2octa(int deci) {
        int bin = 0;
        int place = 1;
        while (deci > 0) {
            int r = deci % 8;
            deci = deci / 8;
            bin = bin + (place*r);
            place = place * 2;
        }
        return bin;
    }

}



