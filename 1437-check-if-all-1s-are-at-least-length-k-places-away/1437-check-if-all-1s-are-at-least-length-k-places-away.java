class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int dif=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                prev=i;
                break;
            }
        }
        for(int i=prev+1;i<n;i++){
            if(nums[i]==0){ 
                dif++;
                continue;
            }
            else {
                if(dif<k) return false;
                dif=0;
            }
        }
        return true;
    }
}