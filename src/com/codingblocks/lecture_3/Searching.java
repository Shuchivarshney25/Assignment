package com.codingblocks.lecture_3;

public class Searching {
    public static void main(String[] args) {
        int[] nums={891,236,496,111};
        int index=linearSearch(nums,496);
        System.out.println(index);
    }
    public static int linearSearch(int[] nums, int target){
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
