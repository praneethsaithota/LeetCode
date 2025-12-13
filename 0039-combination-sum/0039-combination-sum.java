class Solution{
    List<List<Integer>> final_ans=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates,int target){
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>());
        return final_ans;
    }

    void helper(int[] candidates,int target,int i,List<Integer> cur){
        if(target==0){
            final_ans.add(new ArrayList<>(cur));
            return;
        }
        if(target<0) return;

        for(int k=i;k<candidates.length;k++){
            cur.add(candidates[k]);
            helper(candidates,target-candidates[k],k,cur);
            cur.remove(cur.size()-1);
        }
    }
}
