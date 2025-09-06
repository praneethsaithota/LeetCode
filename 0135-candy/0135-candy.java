class Solution{
    public int candy(int[] ratings){
        int n=ratings.length;
        int[] left=new int[n];
        left[0]=1;
        int right=1,sum=0;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]) left[i]=left[i-1]+1;
            else left[i]=1;
        }
        sum=left[n-1];
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) right=right+1;
            else right=1;
            sum+=Math.max(right,left[i]);
        }
        return sum;
    }
}
