class Solution{
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>());
        return ans;
    }

    void helper(int i,int[] a,int t,List<Integer> cur){
        if(t==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(t<0) return;

        for(int k=i;k<a.length;k++){
            if(k>i && a[k]==a[k-1]) continue;
            cur.add(a[k]);
            helper(k+1,a,t-a[k],cur);
            cur.remove(cur.size()-1);
        }
    }
}
