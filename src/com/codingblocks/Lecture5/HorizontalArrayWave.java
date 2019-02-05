package com.codingblocks.Lecture5;
import java.util.Scanner;
public class HorizontalArrayWave
{
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
        };

        display(nums);
        h_wave(nums);

    }



    public static void display(int[][] nums){
        for (int r = 0; r < nums.length; r++) {
            int[] row = nums[r];

            for (int c = 0; c < row.length; c++) {
                System.out.print(row[c] + " ");
            }

            System.out.println();
        }
    }
    public static void h_wave(int[][] nums){
        for (int r = 0; r < nums.length; r++) {
            int[] row = nums[r];

            if ((r % 2) == 0) {
                for (int c = 0; c < row.length; c++) {
                    System.out.print(row[c] + " ");
                }
            } else {
                for (int c = row.length-1; c >= 0; c--) {
                    System.out.print(row[c] + " ");
                }
            }
        }
    }
}
