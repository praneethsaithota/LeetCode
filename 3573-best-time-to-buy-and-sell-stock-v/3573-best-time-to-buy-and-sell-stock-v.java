class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;

        long[] dp0 = new long[k+1];
        long[] dp1 = new long[k+1];
        long[] dp2 = new long[k+1];

        for(int j=0;j<=k;j++){
            dp0[j] = 0;
            dp1[j] = Long.MIN_VALUE / 2;
            dp2[j] = Long.MIN_VALUE / 2;
        }

        for(int i=0;i<n;i++){
            for(int j=k;j>=0;j--){
                if(dp1[j] + prices[i] > dp0[j])
                    dp0[j] = dp1[j] + prices[i];

                if(dp2[j] - prices[i] > dp0[j])
                    dp0[j] = dp2[j] - prices[i];

                if(j > 0){
                    if(dp0[j-1] - prices[i] > dp1[j])
                        dp1[j] = dp0[j-1] - prices[i];

                    if(dp0[j-1] + prices[i] > dp2[j])
                        dp2[j] = dp0[j-1] + prices[i];
                }
            }
        }

        return dp0[k];
    }
}
