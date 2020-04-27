package com.allever.leetcode.solution1;

public class Solution {
    public static void main(String[] args) {
        int[] exam1Input = {2, 7, 11, 15};
        int exam1Target = 22;
        int[] exam1Result = exam1(exam1Input, exam1Target);
        if (exam1Result != null) {
            int i = exam1Result[0];
            int j = exam1Result[1];
            System.out.println("i = "+ i + "; j = " + j);
        }
    }

    //LeetCode第一题，暴力解法
    public static int[] exam1(int[] values, int target) {
        int i;
        int j;
        for (i = 0; i < values.length - 1; i++) {
            for (j = i + 1; j < values.length; j++) {
                if (values[i] + values[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }
}
