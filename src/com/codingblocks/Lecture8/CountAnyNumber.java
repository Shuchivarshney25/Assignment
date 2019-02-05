package com.codingblocks.Lecture8;

public class CountAnyNumber {
    public static void main(String[] args) {
        int nums[] = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100000);
        }
        numberfun(nums, 100000);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            builder.append(nums[i]);
            builder.append(" ");
        }

        System.out.println(builder);
    }

    public static void numberfun(int[] nums, int d) {
        int[] freq = new int[d + 1];
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            freq[v]++;
        }
        int pos = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                freq[pos]++;
            }
        }
    }
}