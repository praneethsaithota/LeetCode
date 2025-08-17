class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        
        if(n==1){
            return 1;
        }
        int index=-1;
        int count=0;
        for (int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                continue;
            }
            index=i;
            break;
        }
        for( int i=index;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
                continue;
            }
            return count;
        }
        return count;
    }
}