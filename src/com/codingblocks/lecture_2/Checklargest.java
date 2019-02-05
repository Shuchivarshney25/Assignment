package com.codingblocks.lecture_2;
import java.util.Scanner;
public class Checklargest {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
        for (int i = 1; i <= n1 ; i++) {
            int k = 3 * i + 2;
            if(k % n2 != 0){
                System.out.println(k);
            }else{
                n1=n1+1;
            }
        }

    }
}
