package com.codingblocks.Lecture4;

public class Sorting {
    public static void main(String[] args) {
       int[] nums={98,22,78,1};
       bubble(nums);
       display(nums);
    }
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static  void bubble(int[] nums){
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;

                }
            }
        }

    }
}
