class Solution {
    public int minOperations(String s) {
        // TC ->O(N)
        // SC ->O(1)
       
       int pattern1 = 0; // Strrts with 0;
       int pattern2 = 0; // Starts with 1;

       for(int i=0 ;i<s.length() ;i++){
        char expt1 = (i % 2 == 0) ? '0':'1';
        char expt2 = (i % 2 == 0) ? '1':'0';

        if(s.charAt(i) == expt1){
            pattern1++;
        }
         if(s.charAt(i) == expt2){
            pattern2++;
        }

       }
       return Math.min(pattern1,pattern2);
    }
}