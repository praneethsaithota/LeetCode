class Solution {
    public int bestClosingTime(String customers) {
        int penalty = Integer.MAX_VALUE;
        int n=customers.length();
        int ans=0;

        int[] pre_n = new int[n];
        int[] suf_y = new int[n];

        for(int i=0;i<n;i++){
            if(customers.charAt(i) == 'N'){
                if(i==0) pre_n[0]=1;
                else pre_n[i]=pre_n[i-1]+1;
            }else{
                if(i!=0) pre_n[i]=pre_n[i-1];
            }
        }

        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i) == 'Y'){
                if(i==n-1) suf_y[n-1]=1;
                else suf_y[i]=suf_y[i+1]+1;
            }else{
                if(i!=n-1) suf_y[i]=suf_y[i+1];
            }
        }

        for(int k=0;k<=n;k++){
            int cur=0;

            if(k>0) cur+=pre_n[k-1];
            if(k<n) cur+=suf_y[k];

            if(cur<penalty){
                penalty=cur;
                ans=k;
            }
        }

        return ans;
    }
}
