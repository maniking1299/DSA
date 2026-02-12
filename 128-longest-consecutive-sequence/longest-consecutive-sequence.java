class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        // TC -> O(N)
        // SC -> O(N)

        for(int i:nums){
            hs.add(i);
        }

        int longest =0;

        for(int i:hs){
            int currSum = 1;
            // If not the begnning Skip
            if(hs.contains(i-1)){
                continue;
            }else{
                int next = i+1;
                while(hs.contains(next)){
                    currSum++;
                    next++;
                }

            }

            longest = Math.max(longest,currSum);


        }

        return longest;
    }
}