class Solution {
    public boolean isValidSudoku(char[][] board) {
     int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char currentValue = board[i][j];
                if (currentValue != '.') {
                    board[i][j] = '.';
                    if (!isSafe(board, i, j, currentValue)) {
                        return false;
                    }
                    board[i][j] = currentValue;
                }
            }
        }
        return true;
    }
     static boolean isSafe(char[][] board, int row, int col, char num) {
        for(int j=0;j<9;j++){
            if(board[row][j]==num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }int sr=(row/3)*3;
         int sc=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            if(board[sr+i][sc+j]==num){
                return false;
            }
        }
        return true;
    }
}