class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        // Tc ->O(N)
        // Sc ->O(N)
        
        if(bulbs.size() == 0){
            return new ArrayList<>();
        }

        Collections.sort(bulbs);
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0 ; i<bulbs.size() ; i++){
            if(ans.contains(bulbs.get(i))){
                ans.remove(Integer.valueOf(bulbs.get(i)));
            }else{
                ans.add(bulbs.get(i));
            }
        }

        return ans;
    }
}