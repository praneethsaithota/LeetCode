class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    HashSet<List<Integer>> hs=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ans.add(new ArrayList<>());
        function(nums,0,n,new ArrayList<>());
        
        return ans;
    }
    public void function(int[] nums, int x, int n, List<Integer> temp) {
    if (x == n) return;

    for (int i = x; i < n; i++) {
        temp.add(nums[i]);

        if (hs.add(new ArrayList<>(temp))) {
            ans.add(new ArrayList<>(temp));
        }

        function(nums, i + 1, n, temp);

        temp.remove(temp.size() - 1);
    }
}

}