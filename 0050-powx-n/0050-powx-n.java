class Solution {
    public double myPow(double x, int n) {
        long y=n;
        if (x == 0 && n < 0) return Double.POSITIVE_INFINITY;
        if(x==1){
            return 1;
        }
        
        double ans=1.00;
        if(n<0){
            x=1/x;
            y=-y;
        }
        while(y>0){
            if(y%2==1){
                ans=ans*x;
            }
            x=x*x;
            y=y/2;
        }
        return ans;
        
    }
}