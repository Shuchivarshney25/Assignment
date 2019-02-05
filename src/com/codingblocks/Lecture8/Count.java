package com.codingblocks.Lecture8;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1};
        countfun(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void countfun(int[] nums){
       //int count=0;
        int zero=0;
        int one=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if(i<zero){
                nums[i]=0;
            }else{
                nums[i]=1;
            }

        }
        }
    }

