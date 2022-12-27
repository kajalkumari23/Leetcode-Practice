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
class Solution 
{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {//Postorder Traversal   
        if(root1 == null)
           return root2;
      
        if(root2 == null)  
           return root1;
        TreeNode left= mergeTrees(root1.left, root2.left);//recursing down the left subtree and knowing about the left child 
        TreeNode right= mergeTrees(root1.right, root2.right);//recursing down the right subtree and knowing about the right child 
     
        TreeNode node= new TreeNode(root1.val+root2.val, left, right);
      
        return node; 
    }
}