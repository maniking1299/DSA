class Solution {
    public boolean checkOnesSegment(String s) {
        // TC -> O(N)
        // SC -> O(1)
        return !s.contains("01");
    }
}