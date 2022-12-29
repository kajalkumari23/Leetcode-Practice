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
public class Solution {
//Recursion
public List<String> binaryTreePaths(TreeNode root) {
    List<String> sList=new LinkedList<String>();
    //String s=new String();
    if (root==null) return sList;
    if (root.left==null && root.right==null) {
        sList.add(Integer.toString(root.val));
        return sList;
    }
    
    for (String s: binaryTreePaths(root.left)) {
        sList.add(Integer.toString(root.val)+"->"+s);
    }
    for (String s: binaryTreePaths(root.right)) {
        sList.add(Integer.toString(root.val)+"->"+s);
    }
    return sList;
}
}