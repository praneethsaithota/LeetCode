class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0],min=nums[0],ans=nums[0];
        for(int i=1;i<n;i++){
            int a=max*nums[i];
            int b=min*nums[i];
            max=Math.max(nums[i],Math.max(a,b));
            min=Math.min(nums[i],Math.min(a,b));
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
