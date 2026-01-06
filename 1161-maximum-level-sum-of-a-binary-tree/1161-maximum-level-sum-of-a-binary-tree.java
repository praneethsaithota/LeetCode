class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> que=new ArrayDeque<>();
        que.add(root);

        int ans=root.val;
        int final_ans=1;
        int c=1;

        while(!que.isEmpty()){
            int x=que.size();
            int temp=0;

            for(int i=0;i<x;i++){
                TreeNode cur=que.poll();
                temp+=cur.val;

                if(cur.left!=null) que.add(cur.left);
                if(cur.right!=null) que.add(cur.right);
            }

            if(temp>ans){
                ans=temp;
                final_ans=c;
            }
            c++;
        }
        return final_ans;
    }
}
