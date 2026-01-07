class Solution{
    long max=0;
    int mod=1000000007;

    public int find_total(TreeNode root){
        if(root==null) return 0;
        return root.val+find_total(root.left)+find_total(root.right);
    }

    public int maximum(TreeNode root,int total){
        if(root==null) return 0;
        int temp=root.val+maximum(root.left,total)+maximum(root.right,total);
        max=Math.max(max,(long)temp*(total-temp));
        return temp;
    }

    public int maxProduct(TreeNode root){
        int total=find_total(root);
        maximum(root,total);
        return (int)(max%mod);
    }
}
