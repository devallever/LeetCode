package com.allever.leetcode.solution66;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {3, 3, 9};
//        int result = solution.addOne(values);
//        System.out.println("result = " + result);
        return;
    }

    public int[] addOne(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            values[i]++;
            values[i] = values[i] % 10;
            if (values[i] != 0) {
                return values;
            }

            values = new int[values.length + 1];
            values[0] = 1;
            return values;
        }
        return values;
    }

//    public int addOne(int[] values) {
//        int len = values.length;
//        int times = 1;
//        int sum = 0;
//        for(int i = 0; i < len; i++) {
//            int index = values[len -1 - i];
//            if (i == 0) {
//                sum = sum + index;
//            } else {
//                sum = sum + index * times;
//            }
//
//            times = times * 10;
//        }
//
//        return sum + 1;
//    }
}
