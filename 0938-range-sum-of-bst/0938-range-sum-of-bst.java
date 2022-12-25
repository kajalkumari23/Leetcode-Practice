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
    private int sum = 0;
    public int rangeSumBST(TreeNode R, int L, int H) { //root, low, high
        rangeSumBSTHelper(R,L,H);
        return sum;
    }
    private void rangeSumBSTHelper(TreeNode R, int L, int H){
        if(R==null){
            return ;
        }
        if(R.val>=L && R.val<=H){
            sum+=R.val;
            rangeSumBSTHelper(R.left,L, R.val);
            rangeSumBSTHelper(R.right, R.val,H);  
        }else if(R.val<L){
            rangeSumBSTHelper(R.right,L,H);
        }else if(R.val>H){
            rangeSumBSTHelper(R.left, L, H);
        }
    }
}