class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int ans=0;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        if(customers.charAt(0) == 'N') dp1[0] = 1;
        if(customers.charAt(n-1)=='Y') dp2[n-1] = 1;
        for(int i=1;i<n;i++){
            if(customers.charAt(i) == 'N'){
                dp1[i]=dp1[i-1]+1;
            }
            else{
                dp1[i]=dp1[i-1];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(customers.charAt(i) == 'Y'){
                dp2[i]=dp2[i+1]+1;
            }
            else{
                dp2[i]=dp2[i+1];
            }
        }
        int pen = dp2[0];
        if(pen == n) return n;
        for(int i=1;i<n;i++){
            if(dp1[i-1] + dp2[i] < pen ){
                pen=dp1[i-1] + dp2[i];
                ans=i;
            }
        }
        if(dp1[n-1] < pen){
            ans = n;
        }
        return ans;
    }
}