class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count = 0;

        for(int i=0 ; i<n ;i++){
            for(int j=0 ;j<m ;j++){
                if(mat[i][j] == 1){
                    if(checkRowCol(mat,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private boolean checkRowCol(int arr[][] ,int row ,int col){

        for(int i=0;i<arr.length; i++){
            if(i != row && arr[i][col] == 1){
                return false;
            }
        }
        for(int j=0;j<arr[0].length; j++){
            if(j != col && arr[row][j] == 1){
                return false;
            }
        }

        return true;
    }
}