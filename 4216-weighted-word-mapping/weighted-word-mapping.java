class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        // TC -> O(N*L) 
        // SC -> O(N)
        
        StringBuilder sb = new StringBuilder();

        for(String s :words){
            int sm = sum(s , weights);
            int idx = sm%26;

            char ch = Findchar(idx);
            sb.append(ch);
        }
        return sb.toString();
    }
    private int sum(String s , int[] weights){
        int sum =0;
        for(int i=0 ;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch-'a';

            sum += weights[idx];
        }

        return sum;
    }
    private char Findchar(int idx){
        
        return (char)('z' - idx );
    }
}





