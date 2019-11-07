package LeetCode.DiameterOfBinaryTree;

import LeetCode.TreeNode;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-07 17:24
 */
public class Solution {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;

    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;

    }
}
