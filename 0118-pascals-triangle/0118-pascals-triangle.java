class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ans1=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    ans1.add(1);
                }
                else{
                    int x=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    ans1.add(x);
                }

            }
            ans.add(ans1);
        }
        return ans;
    }
}