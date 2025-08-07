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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        TreeNode head=new TreeNode(preorder[0]);
        for(int i=1;i<n;i++){
            if(preorder[i]<=head.val){
                head.left=helper(preorder[i],head.left);
            }
            else{
                head.right=helper(preorder[i],head.right);
            }
        }
        return head;
    }
    public TreeNode helper(int i,TreeNode root){
        if(root==null){
            return new TreeNode(i);
          
        }
        if(i <= root.val){
           root.left=helper(i,root.left);
        }
        else{
           root.right=helper(i,root.right);
        }
        return root;
    }
    
}