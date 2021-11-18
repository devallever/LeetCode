package com.allever.leetcode.solution26;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 1, 1, 1, 1, 2, 3, 4};
        int result = solution.removeRepeat2(a);
//        for(int i = 0; i < a.length; i++) {
//            System.out.print("" + a[i] + "->");
//        }
        System.out.println("result = " + result);
    }

    public int removeRepeat2(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int i = 0;
        int len = a.length;
        for (int j = 1; j < len; j++) {
            if (a[j] != a[i]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }

    /**
     * 双指针(快慢指针)法
     * @param a
     * @return
     */
    public int removeRepeat(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        int slow = 1;
        int fast = 1;

        while (fast < a.length) {
            if (a[slow] != a[fast]) {
                a[slow] = a[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
