package LeetCode.MergeTwoBinaryTrees;

import LeetCode.TreeNode;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-11-07 16:31
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 == null) {
            return t1;
        } else if (t1 == null) {
            return t2;
        }
        TreeNode currentNode = new TreeNode(t1.val + t2.val);
        currentNode.left = mergeTrees(t1.left, t2.left);
        currentNode.right = mergeTrees(t1.right, t2.right);
        return currentNode;

    }
}
