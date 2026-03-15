class Solution {
    public long countCommas(long n) {

        // TC ->O(1)
        // SC ->O(1)

        if(n<1000) return 0;

        long total = Math.max(0,n-1000L+1)+ Math.max(0,n-1000000L+1)+ Math.max(0,n-1000000000L+1)+ Math.max(0,n-1000000000000L+1)+ Math.max(0,n-1000000000000000L+1);

        return total;
    }
}