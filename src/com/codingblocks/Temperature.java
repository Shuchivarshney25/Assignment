package com.codingblocks;

public class Temperature {
    public static void main(String[] args) {
        int start=0;
        int end=300;
        int step=20;
        while(start<end){
            float cel=((5f/9)*(start-32));
            System.out.printf("%.2f \n",cel);
            start=start+step;
        }
    }
}
