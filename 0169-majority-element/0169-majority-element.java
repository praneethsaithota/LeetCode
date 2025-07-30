class Solution {
    public int majorityElement(int[] nums) {
        int ans=nums[0],count=1,n=nums.length;
        for (int i=1;i<n;i++){
           if(nums[i]==ans){
            count++;
           }
           else{
            count--;
           }
           if(count==0){
            ans=nums[i];
            count=1;
           }
        }
        int x=0;
        for (int i=0;i<n;i++){
            
            if(nums[i]==ans){
                x++;
            }
        }
        if(x>n/2){
            return ans;
        }

        return ans;

    }
}