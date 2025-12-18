class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        int n = nums.length;
        if(n == 0) return 0;

        for(int i=0;i<n;i++){
            temp.add(nums[i]);
        }

        int c = 1;

        for(int i=0;i<n;i++){
            if(!temp.contains(nums[i])) continue;

            if(nums[i] != Integer.MIN_VALUE && temp.contains(nums[i]-1))
                continue;

            int ans = 1;
            int x = nums[i];
            temp.remove(x);

            while(x != Integer.MAX_VALUE && temp.contains(x+1)){
                x++;
                temp.remove(x);
                ans++;
            }
            if(ans > c) c = ans;
        }
        return c;
    }
}
