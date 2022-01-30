package com.company;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        traverse(list, root);
        return list.get(k - 1);
    }

    private void traverse(List<Integer> list, TreeNode node) {
        if (node.left != null) {
            traverse(list, node.left);
        }
        list.add(node.val);
        if (node.right != null) {
            traverse(list, node.right);
        }
    }
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
