class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        long ans=0;
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(happiness[i]-j >=0 ) ans=ans+happiness[i]-j;
            else ans=ans+0;
            k--;
            j++;
            if(k==0) return ans;
        }
        return ans;
    }
}