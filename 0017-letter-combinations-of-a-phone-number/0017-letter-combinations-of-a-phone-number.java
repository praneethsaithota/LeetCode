class Solution {
    public List<String> letterCombinations(String digits) {
        
        ArrayList<String> ans=new ArrayList<>();
         if(digits.isEmpty()){
            return ans;
        }
        String[] temp=new String[8];
        for(int i=0;i<=7;i++){
            if(i==0){
                temp[i]="abc";
            }
            else if(i==1){
                temp[i]="def";
            }
            else if(i==2){
                temp[i]="ghi";
            }
            else if(i==3){
                temp[i]="jkl";
            }
            else if(i==4){
                temp[i]="mno";
            }
            else if(i==5){
                temp[i]="pqrs";
            }
            else if(i==6){
                temp[i]="tuv";
            }
            else {
                temp[i]="wxyz";
            }

            
        }
        int n=digits.length();
        StringBuilder value=new StringBuilder();
       
        helper(0,n,temp,ans,value,digits);
        
        return ans;
        
       
        
    }
    public void helper(int x,int n,String[] temp,ArrayList<String> ans,StringBuilder value,String digits ){
        if(x==n){
            String value2=value.toString();
            ans.add(value2);
           
            if(value.length() > 0) value.deleteCharAt(value.length() - 1);
            

            return;
        }
        int a=Integer.parseInt(String.valueOf(digits.charAt(x)));
        for(int i=0;i<temp[a-2].length();i++){
            value.append(temp[a-2].charAt(i));
            helper(x+1,n,temp,ans,value,digits);
        }
        if(value.length() > 0) value.deleteCharAt(value.length() - 1);
        return;
    }
}