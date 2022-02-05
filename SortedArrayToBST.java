package com.company;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return convert(nums, 0, nums.length - 1);
    }

    private TreeNode convert(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, low, mid - 1);
        node.right = convert(nums, mid + 1, high);
        return node;
    }

}
