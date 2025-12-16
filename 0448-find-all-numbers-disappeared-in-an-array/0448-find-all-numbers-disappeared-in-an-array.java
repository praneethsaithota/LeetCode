class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans1=new ArrayList<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[nums[i]-1]++;
        }
        
        for(int j=0;j<n;j++){
            // System.out.println(ans[j]);
            if(ans[j]==0){
                
                ans1.add(j+1);
            }
        }
        return ans1;
    }
}