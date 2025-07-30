class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i-1;
                break;
                
            }


        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
            
        }
         reverse(nums,index+1,nums.length-1);
        
    }
    public void swap(int[] nums, int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void reverse(int[] nums, int s, int e){
        while(s<e){
        swap(nums,s,e);
        s++;e--;
        }
    }
}