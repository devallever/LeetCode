package com.allever.leetcode.solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 3, 5, 7};
        int target = 9;
        Solution2 solution = new Solution2();
        int[] result = solution.answer2(a, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("没结果");
        }
    }

    /**
     * 这是我想到的方案
     * 时间复杂度 O(n) = n^2
     * 空间复杂度 O(n) = 1
     * @param list
     * @param target
     * @return
     */
    public int[] answer(int[] list, int target) {
        int[] result = new int[2];
        for (int i = 0; i < list.length; i++) {
            int other = target - list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] == other) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    /**
     * 时间复杂度 O(n) = n
     * 空间复杂度 O(n) = n
     * @param list
     * @param target
     * @return
     */
    public int[] answer2(int[] list, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(list.length);
        for (int i = 0; i < list.length; i++) {
            int other = target - list[i];
            if (map.containsKey(other)) {
                result[0] = map.get(other);
                result[1] = i;
                return result;
            }
            map.put(list[i], i);
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
    public static int[] answer3(int[] a, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(a.length);
        for (int i = 0; i < a.length; i++) {
            int other = target - a[i];
            if (hashMap.containsKey(other)) {
                return new int[] {hashMap.get(other), i};
            }
            hashMap.put(a[i], i);
        }

        return null;
    }


}
