package com.codingblocks.Lecture9;

public class ArrayIndexValueRec {
    public static void main(String[] args) {
        int[] nums={7,3,5,1};
        int k=index(nums,0,5);
        System.out.println(k);
    }
    public static int index(int[] nums, int index, int target){
        if(index==nums.length){
            return -1;
        }
        if(nums[index]==target){
            return index;
        }
        return index(nums,index+1,target);
    }
}
