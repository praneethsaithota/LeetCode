class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);

        int best = 0;

        for(int x : set){
            if(!set.contains(x - 1)){
                int len = 1;
                int cur = x;

                while(set.contains(cur + 1)){
                    cur++;
                    len++;
                }
                if(len > best) best = len;
            }
        }
        return best;
    }
}
