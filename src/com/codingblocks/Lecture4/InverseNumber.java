package com.codingblocks.Lecture4;

public class InverseNumber {
    public static void main(String[] args) {
         int nums[]={0,1,2,4,3};
         System.out.println(nums);
    }
    public static int[] inverse(int[] nums){
        int[] res=new int[nums.length];
        for (int pos = 0; pos <nums.length ; pos++) {
            int val=nums[pos];
            res[val]=pos;
        }
        return res;
    }

}
