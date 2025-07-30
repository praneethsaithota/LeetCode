class Solution {
    public int[] minOperations(String boxes) {
        int m=boxes.length();
        char[] A=boxes.toCharArray();
        int[] result=new int[m];
        int[] pfx=new int[m];
        int[] sfx=new int[m];
        int sum1=0,count1=0;
        int sum2=0,count2=0;
        for(int i=0;i<m;i++){
            pfx[i]=count1;
            if(A[i]=='1'){
                sum1++;
                }
                count1=count1+sum1;
        }
        for(int i=m-1;i>=0;i--){
            sfx[i]=count2;
            if(A[i]=='1'){
                sum2++;
                }
                count2=count2+sum2;
                result[i]=pfx[i]+sfx[i];
        }
        return result;

    }
}
        