package com.codingblocks.lecture_3;

/* Ques1*/
public class Ques1 {
    public static void main(String[] args) {
        int n = bin2deci(1010);
        System.out.println(n);
    }

        public static int bin2deci(int bin){
        int deci=0;
        int place=1;
        while(bin>0){
             int r=bin%10;
             bin=bin/10;
             deci=deci+r*place;
             place=place*2;

        }
        return deci;
    }
  }
////    public static int any2deci(int any,int base) {
////        int deci = 0;
////        int place = 1;
////        while (any > 0) {
////            int r = any % 10;
////            any = any / 10;
////            deci = deci + r * place;
////            place = place * 2;
////
////        }
////        return deci;
////    }
//    /*decimal to binary*/
//    public static int deci2 bin(int deci) {
//        int bin = 0;
//        int place = 1;
//        while (deci > 0) {
//            int r = deci % 2;
//            deci = deci / 2;
//            bin = bin + (place*r);
//            place = place * 10;
//        }
//        return bin;
//    }
//}