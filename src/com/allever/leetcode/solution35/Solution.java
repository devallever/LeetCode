package com.allever.leetcode.solution35;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {1, 3, 5, 6};
        int key = 1;
        int index = solution.binarySearchInsert(values, key);
        System.out.println("index = " + index);
        return;
    }


    public int binarySearchInsert(int[] values, int key) {
        int low = 0;
        int high = values.length - 1;//

        if (key > values[high])  {
            return high+1;
        } else if (key < values[0]) {
            return 0;
        }

        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == values[mid]) {
                return mid;
            } else if (key > values[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return low;
    }
}
