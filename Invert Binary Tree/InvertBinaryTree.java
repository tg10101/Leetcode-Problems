/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // condition if no values are present within the tree
        if(root == null){
            return root;
        }
        // Calling 'invertTree' function to eventually make changes to the left part of the tree
        invertTree(root.left);
        // Calling 'invertTree' function to eventually make changes to the right part of the tree
        invertTree(root.right);
        // Swapping values from the left and right subtrees
        TreeNode values = root.left;
        root.left = root.right;
        root.right = values;
        return root;        //returning the root (values)
    }
}