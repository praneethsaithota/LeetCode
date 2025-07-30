class Solution {
    public void swap(int i,int j,int[][] nums){
        int temp=nums[i][j];
        nums[i][j]=nums[j][i];
        nums[j][i]=temp;
    }
    public void swap1(int row,int i,int j,int[][] nums){
        int temp=nums[row][i];
        nums[row][i]=nums[row][j];
        nums[row][j]=temp;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    swap(i,j,matrix);
                }
            }
        }
        for(int i=0;i<n;i++){
            int x=0,y=n-1;
            while(x<y){
                swap1(i,x,y,matrix);
                x++;
                y--;
            }           
            
        }
        
        



    }
}

