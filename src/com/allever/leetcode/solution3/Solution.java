package com.allever.leetcode.solution3;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 1, 1, 1, 1, 2, 3, 4};
        int result = solution.removeRepeat(a);
//        for(int i = 0; i < a.length; i++) {
//            System.out.print("" + a[i] + "->");
//        }
        System.out.println("result = " + result);
    }

    public int removeRepeat(int[] a) {
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

//    public int removeRepeat(int[] a) {
//        int i, j;
//        int len = a.length;
//        for (i = 0; i < len - 1; i++) {
//            System.out.println("第一层循环 i = " + i);
//            for (j = i+1; j < len; j++) {
//                boolean remove = false;
//                System.out.println("第二层循环");
//                if (a[i] == a[j]) {
//                    //移动，覆盖a[i]
//                    for (int k = i; k < len - 1; k++) {
//                        a[k] = a[k + 1];
//                    }
//                    a[len - i - 1] = 0;
//                    len--;
//                    remove = true;
//                    break;
//                }
//                if (remove) {
//                    break;
//                }
//            }
//        }
//        return len;
//    }
}
