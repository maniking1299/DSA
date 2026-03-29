class Solution {
    public boolean isAnagram(String s, String t) {

        // TC ->O(N)
        // SC ->O(N)

         if(s.length()!=t.length()) return false;


        HashMap<Character,Integer> hm = new HashMap<>();

        for(char i=0 ;i<s.length() ;i++){
            char ch = s.charAt(i);

            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(char i=0 ; i<s.length() ; i++){
            char ch = t.charAt(i);

            if(hm.containsKey(ch)){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return hm.isEmpty();
         
        // char charAr[] = s.toCharArray();
        // char charAr1[] = t.toCharArray();

    //     Arrays.sort(charAr);
    //     Arrays.sort(charAr1);

    //     String x = new String(charAr);
    //     String y = new String(charAr1);

    //    return x.equals(y);


    // Hash Map Approch

    // HashMap<Character ,Integer> hm = new HashMap<>();

    // for(Character c:charAr){
    //     hm.put(c,hm.getOrDefault(c,0)+1);
    // }
    // for(Character c:charAr1){
    //     if(hm.containsKey(c)){
    //         hm.put(c,hm.get(c)-1);
    //     }
    //     else{
    //         return false;
    //     }
        
    // }
    //  for (int val : hm.values()) {
    //         if (val != 0) return false;
    //     }
    // return true;





    //Hash Map

   


    // HashMap<Character,Integer> h1 = new HashMap<>();
    // HashMap<Character,Integer> h2 = new HashMap<>();

    // for(int i=0 ; i<s.length() ; i++){

    //     h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
    //     h2.put(t.charAt(i),h2.getOrDefault(t.charAt(i),0)+1);
    // }

    // return h1.equals(h2);

    }
}