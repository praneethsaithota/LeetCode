class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        if(nums.length==0){
            return ans;
        }
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low) / 2;
            

            
            if(target<=nums[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
            
        }
         if (low >= nums.length || nums[low] != target) {
            return ans;
        }
        ans[0] = low;
        high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low) / 2;
            if(target<nums[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
         
        
        ans[1]=high;
        return ans;
        
    }
}