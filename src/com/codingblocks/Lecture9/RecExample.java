package com.codingblocks.Lecture9;

import java.math.BigInteger;

public class RecExample {
    public static void main(String[] args) {
//        pd(5);
//        System.out.println("next one");
//        pi(5);
//        pdi(5);
//        int f = fact(5);
//        System.out.println(f);
//        BigInteger f= factBig(10000);
//        System.out.println(f.toString().length());
//        System.out.println(f);
//        BigInteger f = power(50,25);
//        System.out.println(f);
        int f= fibo(4);
        System.out.println(f);

    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pd(n - 1);


    }

    public static void pi(int n) {
        if (n == 0) {
            return;
        }

        pi(n - 1);
        System.out.println(n);
    }

    public static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

    public static void pdioddeven(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println();
        }
        pdioddeven(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
      }


      public  static BigInteger factBig(int n){
        if(n==0){
            return BigInteger.ONE;
        }
        BigInteger bign=new BigInteger(Integer.toString(n));
        return bign.multiply(factBig(n-1));
      }
    public static BigInteger power(int x,int n){
        if (n==0){
            return BigInteger.ONE;
        }
        BigInteger bign=new BigInteger(Integer.toString(n));
        BigInteger bign1= new BigInteger(Integer.toString(x));
        return bign1.multiply(bign1.pow(n-1));
    }
    public static int pow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return  1;
        }
        return x*pow(x,n-1);
    }
    public static int fibo(int n){
          if(n<2){
            return  n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
