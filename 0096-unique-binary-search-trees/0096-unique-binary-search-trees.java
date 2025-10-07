class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[1-1]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int sum=0;
            int p1=0,p2=i-1;
            while(p1<i){
                sum+=dp[p1]*dp[p2];
                p1++;p2--;
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}