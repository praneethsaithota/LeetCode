class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        int n=a.length,m=b.length;
        int[][] dp=new int[n+1][m+1];

        for(int i=0;i<=n;i++)
            for(int j=0;j<=m;j++)
                dp[i][j]=Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int prod=a[i-1]*b[j-1];
                int take = dp[i-1][j-1];
                take = Math.max(take,0);
                take += prod;

                dp[i][j]=Math.max(
                            prod,
                            Math.max(
                                dp[i-1][j],
                                Math.max(dp[i][j-1], take)
                            )
                        );
            }
        }
        return dp[n][m];
    }
}
