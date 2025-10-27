class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int[] set1= new int[n+1];
        int[] set2= new int[n+1];
        for(int []t: trust){
            set1[t[0]]++;
            set2[t[1]]++;
        }
        for(int i=0;i<n;i++){
            if(set1[i+1]==0 && set2[i+1]==n-1 ){
                return i+1;
            }
        }
  return -1;
    }
}