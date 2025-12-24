class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0,n=apple.length,m=capacity.length;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int box=0;
        for(int i=m-1;i>=0;i--){
            sum-=capacity[i];
            box++;
            if(sum <= 0) return box;
        }
        return 0;
    }
}