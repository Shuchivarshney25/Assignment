package com.codingblocks.lecture_3;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={891,236,496,111};
        int index= bs(nums,496);
        System.out.println(index);
    }
    public static int bs(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

    }
        return -1;
}

}
