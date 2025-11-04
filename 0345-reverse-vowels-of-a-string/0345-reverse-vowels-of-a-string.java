class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int[] temp=new int[n];
        String ans= "";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(isvowel(s.charAt(i))){
                temp[i] = 1;
                st.push(s.charAt(i));
            }  
        }
        int j=n-1,i=0;
        while(j>=0){
            if(temp[i]==1){
                ans=ans+st.peek();
                st.pop();
                i++;
                j--;
                continue;
            }
            ans=ans+s.charAt(i);
            i++;j--;
        }
        
        return ans;
    }
    public boolean isvowel(char x){
        if(x=='a' || x=='e'|| x=='i'|| x=='o' || x=='u' || x=='A' || x=='E'|| x=='I'|| x=='O' || x=='U' ) return true;
        return false;
    }
}