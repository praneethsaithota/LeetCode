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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> given=new ArrayDeque<>();
        given.add(root);
        while(!given.isEmpty()){
            int size=given.size();
            List<Integer> ans1=new ArrayList<>();
            for(int i=0;i<size;i++){
                
                TreeNode remove=given.remove();
                ans1.add(remove.val);
                if(remove.left!=null){
                    given.add(remove.left);
                }
                if(remove.right!=null){
                    given.add(remove.right);
                }

            }
            ans.add(ans1);
        }
        return ans;
        
    }
}