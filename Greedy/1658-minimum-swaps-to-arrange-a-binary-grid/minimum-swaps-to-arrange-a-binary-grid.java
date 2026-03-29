class Solution {
    public int minSwaps(int[][] grid) {

        // TC ->O(N^2)
        // SC ->O(N)

        int n = grid.length;
        
        int cnt[] = new int[grid.length];
    // Counting the trailing 0s 
        for(int i = 0; i < grid.length; i++){
            int count = 0;

            for(int j = grid[i].length - 1; j >= 0; j--){
                if(grid[i][j] == 0){
                    count++;
                } else {
                    break;
                }
            }

            cnt[i] = count;
        }

        // check in rows
       int swap=0;
        for(int i=0 ;i<n ; i++){
            int j= i;
            int required = n-1-i;

            while(j<n && cnt[j]<required){
                j++;
            }
            if(j==n)return -1;
    // swap the adjacent rows .
            while(j>i){
                int temp = cnt[j];
                cnt[j] = cnt[j-1];
                cnt[j-1] = temp;
                swap++;
                j--;
            }
        }

        return swap;


    }

}