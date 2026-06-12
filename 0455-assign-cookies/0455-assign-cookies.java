class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0,b=0;
        //g children s cookies 
        while(a<g.length&&b<s.length){
            if(s[b]>=g[a]){
                a++;
            }
            b++;
        }
        return a;
    }
}