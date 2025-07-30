class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int index=-1;
        
        
        int profit=0;
        for(int x=0;x<prices.length;x++){
            if(prices[x]<buy){
                buy=prices[x];
                index=x;
            }
            profit=Math.max(profit,prices[x]-prices[index]);
        }
        
        return profit;
        
    }
}


