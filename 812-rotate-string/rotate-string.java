class Solution {
    public boolean rotateString(String s, String goal) {

        // TC ->O(N)
        // SC ->O(N)

        if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);
    }
}