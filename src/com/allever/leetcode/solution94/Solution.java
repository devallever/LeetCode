package com.allever.leetcode.solution94;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.value = 1;
        TreeNode rootLeft = new TreeNode();
        rootLeft.value = 2;
        TreeNode rootRight = new TreeNode();
        rootRight.value = 3;
        root.left = rootLeft;
        root.right = rootRight;
        List<Integer> inorderResult = traversal(root);
        for (int value: inorderResult) {
            System.out.print(value + " ");
        }
    }

    /**
     * 递归法
     * @param root
     * @return
     */
    public static List<Integer> traversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        //中序遍历
//        inorderTraversal(root, result);
        //先序遍历
//        preorderTraversal(root, result);
        //后序遍历
        postorderTraversal(root, result);
        return result;
    }

    /**
     * 中序遍历
     * @param node
     * @param list
     */
    public static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node.value);
        inorderTraversal(node.right, list);
    }

    /**
     * 先序遍历
     * @param node
     * @param list
     */
    public static void preorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.value);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
    }

    /**
     * 后序遍历
     * @param node
     * @param list
     */
    public static void postorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.left, list);
        postorderTraversal(node.right, list);
        list.add(node.value);
    }

}
