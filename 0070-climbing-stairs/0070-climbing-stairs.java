class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return ways(n);
    }
    public int ways(int n){
        if(n<=2) return n;
        if(dp[n]==-1){
            dp[n]=ways(n-1)+ways(n-2);
        }
        return dp[n];

    }
}