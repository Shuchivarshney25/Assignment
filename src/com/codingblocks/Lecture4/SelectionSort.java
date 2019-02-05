package com.codingblocks.Lecture4;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {891, 236, 496, 111};
        sort(nums);
    }
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void sort(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            int k=maxIndex(nums,0,nums.length-1);
            swap(nums);


        }
        display(nums);
    }
    public static void swap(int[] nums) {
        int p= nums.length-1;

//        int t = nums[m];
//        nums[m] = nums[p];
//        nums[p] = t;
    }
    public static int maxIndex(int[] nums,int start,int end){
        int m= start;
        for(int i=start;i<=end;i++) {
            if(nums[i]>nums[m]){
                m=i;
            }
        }
        return m;
    }
}
