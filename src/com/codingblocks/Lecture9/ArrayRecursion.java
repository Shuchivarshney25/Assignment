package com.codingblocks.Lecture9;

public class ArrayRecursion {
    public static void main(String[] args) {
      int[] nums={2,4,3,6,8,5};
        System.out.println(find(nums,0,8));
    }
    public static boolean find(int[] nums, int index, int target){
        if(index==nums.length){
            return false;
        }
        boolean present=nums[index]==target;
        return present || find(nums,index+1,target);
    }
}
