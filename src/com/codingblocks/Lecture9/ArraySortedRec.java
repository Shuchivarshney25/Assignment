package com.codingblocks.Lecture9;

public class ArraySortedRec {
    public static void main(String[] args) {
        int[] nums={1,2,9};
        System.out.println(sorted(nums,0));
    }
    public static boolean sorted(int[] nums, int index){
        if(index==nums.length-1){
            return true;
        }
        if(nums[index]>nums[index+1]){
            return false;
        }
        return  sorted(nums,index+1);
    }
}
