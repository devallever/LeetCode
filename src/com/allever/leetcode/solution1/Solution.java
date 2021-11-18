package com.allever.leetcode.solution1;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class Solution {
    public static void main(String[] args) {
        int[] exam1Input = {2, 7, 11, 15};
        int exam1Target = 22;
        int[] exam1Result = twoOfSum2(exam1Input, exam1Target);
        if (exam1Result != null) {
            int i = exam1Result[0];
            int j = exam1Result[1];
            System.out.println("i = "+ i + "; j = " + j);
        } else {
            System.out.println("无解");
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

    /**
     * 暴力解法
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     *
     * @param a
     * @param target
     * @return
     */
    public static int[] twoOfSum(int[] a, int target) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i+1; j < a.length; j ++) {
                if (a[i] + a[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * 使用哈希表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param a
     * @param target
     * @return
     */
    public static int[] twoOfSum2(int[] a, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(a.length);
        for (int i = 0; i < a.length; i++) {
            if (hashMap.containsKey(target - a[i])) {
                return new int[] {hashMap.get(target - a[i]), i};
            }
            hashMap.put(a[i], i);
        }

        return null;
    }
}
