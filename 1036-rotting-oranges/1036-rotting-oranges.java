class Solution {
     static class Pair{
        int r;
        int c;
        Pair(int a,int b){
            r=a;
            c=b;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int time=0;
        Queue<Pair> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    grid[i][j]=0;
                    q.add(new Pair(i,j));
                }
                else if(grid[i][j]==0){
                    grid[i][j]=-99;
                }
                else{
                    fresh++;
                    continue;
                }
            }
        }
        if (fresh==0) return 0;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        while(q.size() > 0){
            Pair p=q.poll();
            for(int i=0;i<4;i++){
                int x=p.r + row[i];
                int y=p.c + col[i];
                if(x>=0 && y>=0 && x<n && y<m && grid[x][y] == 1){
                    grid[x][y]=grid[p.r][p.c]-1;
                    time=Math.min(time,grid[x][y]);
                    fresh--;
                    q.add(new Pair(x,y));
                }
            }
        }
        time=time*-1;
        if(fresh == 0) return time;
        return -1;
    }
}