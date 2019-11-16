package LeetCode.ConvertBstToGreaterTree;

import LeetCode.TreeNode;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-16 20:53
 */
public class Solution {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
