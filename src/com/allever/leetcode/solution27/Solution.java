package com.allever.leetcode.solution27;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {3, 2, 2, 3, 3, 5, 6,3, 7};
        int len = solution.removeElement2(values, 3);
        for (int i = 0; i < len; i++) {
            System.out.print(values[i] + " -> ");
        }
        return;
    }

    public int removeElement2(int[] values, int target) {
        int len = values.length;
        for (int i = 0; i < len; i++) {
            if (values[i] == target) {
                //移动元素
                for (int j = i; j < len - 1; j++) {
                    values[j] = values[j+1];
                }
                len--;
                i--;
            }
        }

        return len;
    }

    public int removeElement(int[] values, int target) {
        int len = values.length;
        for (int j = 0; j < len; j++) {
            if (values[j] == target) {
                values[j] = values[len-1];
                len--;
                j--;
            }
        }
        return len;
    }
}
