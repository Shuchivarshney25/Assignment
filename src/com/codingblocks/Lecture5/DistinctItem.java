package com.codingblocks.Lecture5;

import java.util.Scanner;

public class DistinctItem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums={80,60,50,50,80};
        System.out.println(Distinct(nums));
    }
    public static int Distinct(int[] nums)
    {
        int res=0;
        for (int i = 0; i <nums.length ; i++) {
            res=res^nums[i];
        }
        return res;
    }
}
