package com.allever.leetcode.solution83;

class Solution {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;



        Solution solution = new Solution();
        solution.show(node);
        solution.deleteDuplicates(node);
        solution.show(node);
        return;
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = head.next;

        while (q != null) {
            if (p.val == q.val) {
                p.next = q.next;
            } else {
                p = q;
            }

            q = q.next;
        }
        return head;
    }

    private void show(ListNode head) {
        ListNode q = head;
        while (q != null) {
            System.out.print(q.val);
            if (q.next != null) {
                System.out.print("->");
            } else {
                System.out.println("");
            }

            q = q.next;
        }
    }
}