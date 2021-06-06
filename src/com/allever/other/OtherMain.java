package com.allever.other;

public class OtherMain {
    public static void main(String[] args) {
        OtherMain otherMain = new OtherMain();
//        long result = otherMain.string2Long("123");
//        System.out.println("result = " + result);

//        int a[] = {1, 2, 3, 4, 5};
//        int result = otherMain.binarySearch(a, 5);
//        System.out.println("result = " + result);

//        int result = otherMain.factorial(4);

//        int result = otherMain.addToN(0, 1000);

        String result = otherMain.reverse("abc");
        System.out.println("result = " + result);
    }


    public long string2Long(String content) {
        if (content == null) {
            return -1;
        }
        int len = content.length();
        int digit = 1;
        long sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            char single = content.charAt(i);
            if (single < 48 || single > 57) {
                System.out.println("该字符串不能转换成Long");
                return -1;
            }
            sum += (single- '0') * digit;
            digit *= 10;
        }
        return sum;
    }

    public int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else if (key < a[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int factorial(int n) {
        if (n == 0) {
            System.out.println("0没有阶乘");
            return -1;
        }
        if (n == 1) return 1;
        return n * factorial(--n);
    }

    public int addToN(int preSum, int n) {
        if (n < 1) return preSum;
        return addToN(preSum + n, --n);
    }

    public String reverse(String content) {
        if (content == null || "".equals(content)){
            System.out.println("字符串为空");
            return null;
        }

        int len = content.length();
        if (len == 1) return content;
        String left = content.substring(0, len / 2);
        String right = content.substring(len / 2, len);
        return reverse(right) + reverse(left);
    }

    public String reverse2(String content) {
        if (content == null || "".equals(content)) {
            System.out.println("字符串为空");
            return null;
        }

        StringBuilder builder = new StringBuilder();
        char[] arr = content.toCharArray();
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            builder.append(arr[i]);
        }
        return builder.toString();
    }


}
