class Solution {
    public void function(char[][] chessboard, List<List<String>> ans,int col){
        if(col == chessboard.length){
            saveanswer(chessboard,ans);
            return;
        }
        for (int row=0;row<chessboard.length;row++){
            if(safeornot(row,col,chessboard)){
                chessboard[row][col]='Q';
                function(chessboard,ans,col+1);
                chessboard[row][col]='.';
            }
        }
    }
    public boolean safeornot(int row,int col,char[][] chessboard){
        for(int j=0;j<chessboard.length;j++){
            if(chessboard[row][j]=='Q'){
                return false;
            }
        }
        for(int j=0;j<chessboard.length;j++){
            if(chessboard[j][col]=='Q'){
                return false;
            }
        }
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
           if (chessboard[r][c]=='Q'){
                return false;
           }
        }
        r=row;
        for(int c=col;c>=0 && r<chessboard.length;c--,r++){
           if (chessboard[r][c]=='Q'){
                return false;
           }
        }
        r=row;
        for(int c=col;c<chessboard.length && r>=0;c++,r--){
           if (chessboard[r][c]=='Q'){
                return false;
           }
        }
        r=row;
        for(int c=col;c<chessboard.length && r<chessboard.length;c++ , r++){
           if (chessboard[r][c]=='Q'){
                return false;
           }
        }
        return true;

        
    }
    public void saveanswer(char[][] chessboard ,List<List<String>> ans){
        String row="";
        List<String> partialans=new ArrayList<>();
        for(int i=0;i<chessboard.length;i++){
            row="";
            for(int j=0;j<chessboard[i].length;j++){
                if(chessboard[i][j]=='Q'){
                    row=row+'Q';
                }
                else{
                    row=row+'.';
                }
            }
            partialans.add(row);
        }
        ans.add(partialans);

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] chessboard=new char[n][n];
        function(chessboard,ans,0);
        return ans;
    }
}