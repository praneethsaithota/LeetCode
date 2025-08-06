class Solution {
    int row=0,col=0;
    public boolean helper(int[][] grid,int i){
        int x=grid.length;
        if(i==x*x) return true;
        if( isfound(grid,row,col,i)==true){
             return helper(grid,i+1);
            
        }
        else{
            return false;
        }
       
        
    }
    public boolean isfound(int[][] grid,int m,int n,int i){
        int x=grid.length;
        if(m-2>= 0 &&  n+1<x && grid[m-2][n+1]==i){
            row=m-2;
            col=n+1;
            return true;
        }
        if(m-1>= 0 && n+2<x && grid[m-1][n+2]==i){
            row=m-1;
            col=n+2;
            return true;
        }
        if(m+1<x && n+2<x && grid[m+1][n+2]==i){
            row=m+1;
            col=n+2;
            return true;
        }
        if(m+2 < x && n+1 <x && grid[m+2][n+1]==i){
            row=m+2;
            col=n+1;
            return true;
        }
        if(m+2<x && n-1>=0 && grid[m+2][n-1]==i){
            row=m+2;
            col=n-1;
            return true;
        }
        if(m+1<x && n-2>=0 && grid[m+1][n-2]==i){
            row=m+1;
            col=n-2;
            return true;
        }
        if(m-1>= 0 && n-2>=0 && grid[m-1][n-2]==i){
            row=m-1;
            col=n-2;
            return true;
        }
        if(m-2>= 0 && n-1>=0 && grid[m-2][n-1]==i){
            row=m-2;
            col=n-1;
            return true;
        }
        
        return false;
        
    }
    
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
        
        return helper(grid,1);
    }
}