class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        int count1 = 0;
        int maj1 = 0;

        int count2 = 0;
        int maj2 = 0;

        for(int i=0 ; i<n ;i++){
            if(maj1 == nums[i]){
                count1++;
            }else if(maj2 == nums[i]){
                count2++;
            }else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                maj2 = nums[i];
                count2 =1;
            }else{
                count1--;
                count2--;
            }
        }

        List <Integer> res = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;

        for(Integer i:nums){
            if(maj1 == i){
                freq1++;
            }else if(maj2 == i){
                freq2++;
            }
        }

        if(freq1 > (n/3)){
            res.add(maj1);
        }
        if(freq2 > (n/3)){
            res.add(maj2);
        }

        return res;
    }
    
}
/////////// Better but not optimal ///////////////////////////////////////////////////
        // Tc-> O(N)
        // Sc-> O(N)


    /*    int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }else{
                hm.put(i,1);
            }
        }

        ArrayList<Integer> li = new ArrayList<>();

        for(int i:hm.keySet()){
            if(hm.get(i)>n/3) li.add(i);
        }

        return li;  */

//////////////////////////////////////////////////////////////////////////////////////////////////////////