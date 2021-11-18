package com.allever.leetcode.solution21;

/**
 * 合并两个有序链表
 */
public class Solution {
    public static void main(String[] args) {

        Node node11 = new Node(1);
        Node node12 = new Node(2);
        Node node13 = new Node(3);
        node11.next = node12;
        node12.next = node13;

        Node node21 = new Node(4);
        Node node22 = new Node(5);
        Node node23 = new Node(6);
        node21.next = node22;
        node22.next = node23;

        Solution solution = new Solution();
        Node linkListHead = solution.mergeLinkList2(node11, node21);
        while (linkListHead != null) {
            System.out.print(linkListHead.data);
            if (linkListHead.next != null) {
                System.out.print("->");
            } else {
                System.out.println("");
            }
            linkListHead = linkListHead.next;
        }

        return;
    }

    /**
     * 递归法
     * @param node1
     * @param node2
     * @return 返回较小到节点
     */
    private Node mergeLinkList(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }

        if (node1.data <= node2.data) {
            //如果第一个结点值小于第二个结点值，就合并第一个结点的下一个结点和第二个结点
            node1.next = mergeLinkList(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeLinkList(node2.next, node1);
            return node2;
        }
    }

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    private Node mergeLinkList2(Node l1, Node l2) {
        //返回链表到头节点
        Node preHead = new Node(-1);
        //指向比较后最小节点
        Node prev = preHead;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                //prev的next指向最小的一个节点, prev.next也就是preHead.next
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if (l1 == null) {
            prev.next = l2;
        } else {
            prev.next = l1;
        }

        return preHead.next;
    }
}
