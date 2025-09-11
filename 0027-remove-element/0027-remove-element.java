class Solution {
    public int removeElement(int[] nums, int val) {
        int x=0,y=nums.length-1,count=0;
        while(x<=y){
            if(nums[y]==val){
                y--;
                count++;
                continue;
            }
            if(nums[x]!=val){
                x++;
                continue;
            }
            if(nums[x]==val){
                swap(nums,x,y);
                count++;
                x++;
                y--;
                continue;
            }
        }
        return x;
    }
    public void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

        
}