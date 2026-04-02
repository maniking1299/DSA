class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if( !isValid(i,j,board)){
                    return false;
                }
            }
        }
        return true;
    }
    // manish
    private boolean isValid(int row , int col, char[][] board){
        if(board[row][col] == '.')return true;

        for(int i=0; i<9; i++){
            // For row
            if(col!=i && board[row][i] == board[row][col])return false;
            // for col
            if(row!=i && board[i][col] == board[row][col])return false;
            //for boxes
            int boxRow = 3*(row/3)+(i/3);
            int boxCol = 3*(col/3)+(i%3);
            if(boxRow!=row && boxCol!=col&& board[boxRow][boxCol]== board[row][col]) 
                return false;
        }
        return true;
    }
}