class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] ans=intervals[i];
            if(merged.isEmpty() || merged.get(merged.size()-1)[1]<ans[0]){
                merged.add(ans);
            }
            else{
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],ans[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}