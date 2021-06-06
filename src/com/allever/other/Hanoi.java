package com.allever.other;

public class Hanoi {

    private static int mCount = 0;

    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";


    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.hanoi(4, A, B, C);

    }

    public void hanoi(int n, String a, String b, String c) {
        if (n == 1) {
            move(a, c, 1);
            return;
        }

        hanoi(n-1, a, c, b);
        move(a, c, n);
        hanoi(n-1, b, a, c);
    }

    public void move(String from, String to, int position) {
        mCount++;
        System.out.println("第 " + mCount +" 步： " + "将 " + position + " 从 " + from + " 移动到 " + to);
    }
}
