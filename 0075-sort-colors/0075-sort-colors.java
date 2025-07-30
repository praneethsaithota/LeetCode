class Solution {
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(m,l,nums);
                m++;l++;
            }
            else if(nums[m]==1) m++;
            else{
                swap(m,h,nums);
                h--;
            }
        }
    }
}