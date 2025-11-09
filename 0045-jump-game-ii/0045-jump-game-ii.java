class Solution {
    public int jump(int[] nums) {
        int jumps=0,len=0,i=0,n=nums.length;
        while(len <(n-1)){
            int max=0;
            for(;i<=len;i++){
                max=Math.max(max,nums[i]+i);               
            }
              len=max;
                jumps++;
        }
        return jumps;
    }
}