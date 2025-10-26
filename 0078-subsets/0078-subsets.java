class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> temp = new ArrayList<>();
        find(nums,0,temp);
        return ans;
    }
    public void find(int[] nums, int n,List<Integer> temp){
        if(n==nums.length){
            List<Integer> temp2 = new ArrayList<>(temp);
            ans.add(temp2);
            return;
        }
        temp.add(nums[n]);
         find(nums,n+1,temp);
        temp.remove(temp.size()-1);
         find(nums,n+1,temp);
    }
}