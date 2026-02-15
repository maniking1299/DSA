class Solution {
    public int firstUniqueFreq(int[] nums) {

// TC -> O(N)
// SC -> O(N)

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

       
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:map.values()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            int frq = map.get(i);

            if(freq.get(frq) == 1){
                return i;
            }
        }

        return -1;
    }
}