class Solution {
    public int countBinarySubstrings(String s) {
        
        // TC ->O(N)
        // SC ->O(1)

        int ans = 0;
        int currGroup = 1;
        int prevGroup = 0;

        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currGroup++;
            }else{
                ans += Math.min(currGroup , prevGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        ans += Math.min(currGroup , prevGroup);

        return ans;
    }
}