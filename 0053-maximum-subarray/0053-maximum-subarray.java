class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=-99999999;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            maxsum=Math.max(sum,maxsum);

        }
        return maxsum;
    }
}