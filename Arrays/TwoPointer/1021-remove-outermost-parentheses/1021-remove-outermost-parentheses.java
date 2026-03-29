class Solution {
    public String removeOuterParentheses(String s) {

        // TC ->O(N)
        // SC ->O(N)
        
        int depth = 0;
        StringBuilder ans = new StringBuilder();

        for(char ch:s.toCharArray()){
           if(ch == '('){
             if(depth>0){
                ans.append(ch);
            }
             depth++;
           
           }else if(ch == ')'){
            depth--;
            if(depth>0){
            ans.append(ch);
            }

           }

        }

        return ans.toString();
    }
}