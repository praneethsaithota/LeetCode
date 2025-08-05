class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'  ){
                ans.push(s.charAt(i));
            }
            else{
                if(ans.size()==0){
                    return false;
                }
                if(ans.peek() == '(' && s.charAt(i) == ')'){
                    ans.pop();
                }
                else if(ans.peek() == '{' && s.charAt(i) == '}'){
                    ans.pop();
                }
                else if(ans.peek() == '[' && s.charAt(i) == ']'){
                    ans.pop();
                }
                else return false;
            }
            }
        if(ans.size()==0){
            return true;
        }
        else return false;
        
    }
}