class Solution {

    public int numMagicSquaresInside(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;

        for(int i=0;i+2<m;i++){
            for(int j=0;j+2<n;j++){
                if(isMagic(grid,i,j)) ans++;
            }
        }
        return ans;
    }

    public boolean isMagic(int[][] g,int r,int c){

        if(g[r+1][c+1]!=5) return false;

        boolean[] seen=new boolean[10];

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                int v=g[i][j];
                if(v<1 || v>9) return false;
                if(seen[v]) return false;
                seen[v]=true;
            }
        }

        for(int i=0;i<3;i++){
            int rs=0,cs=0;
            for(int j=0;j<3;j++){
                rs+=g[r+i][c+j];
                cs+=g[r+j][c+i];
            }
            if(rs!=15 || cs!=15) return false;
        }

        int d1=g[r][c]+g[r+1][c+1]+g[r+2][c+2];
        int d2=g[r][c+2]+g[r+1][c+1]+g[r+2][c];

        if(d1!=15 || d2!=15) return false;

        return true;
    }
}
