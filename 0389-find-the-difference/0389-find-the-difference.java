class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0, sum2=0, n=t.length();
        for(int i=0;i<n-1;i++){
            sum=sum + (int)s.charAt(i);
            sum2+=(int)t.charAt(i);
        }
        sum2+=(int)t.charAt(n-1);
        return (char)(sum2-sum);
    }
}