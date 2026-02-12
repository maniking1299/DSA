class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Brute force way ->
        // TC = O(n^2)
        // SC = O(n^2)
        int ans[][] = new int[n][n];
        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<n ;j++){

                ans[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}