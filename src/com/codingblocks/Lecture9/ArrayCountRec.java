package com.codingblocks.Lecture9;

public class ArrayCountRec {
    public static void main(String[] args) {
        int[] nums={2,4,5,8,6,4};
        int k= count(nums,0,4);
        System.out.println(k);
    }
    public static int count(int[] nums, int index, int target){
        if(index==nums.length){
            return 0;
        }
        int c= count(nums,index+1,target);
        if(nums[index]==target){
            c=c+1;
        }
        return c;
    }
}
