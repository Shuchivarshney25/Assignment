//package com.codingblocks.Lecture8;
//
//public class LeftRotation {
//    public static void main(String[] args) {
//        int nums[]={4,6,7,8,9};
//        int d=3;
//        LeftRotationfun(nums,d);
//
//    }
//    public static void LeftRotationfun(int[] nums, int d){
//        d=d%nums.length;
//        int[] temp= new int[d];
//        //copy first d items
//        for (int i = 0; i <d ; i++) {
//            temp[i]=nums[i];
//        }
//        //move remaining items to first
//        for (int i = d; i <nums.length ; i++) {
//            nums[i-d]=nums[i];
//        }
//        for (int i = 0; i <temp.length ; i++) {
//            nums[i+nums.length-d]=temp[i];
//        }
//
//
//    }
//
//}
