class Solution {
    public int majorityElement(int[] nums) {

// Optimal Solution -> Moore Voting Algorithm ///////////////
    // TC ->O(N)
    // SC ->O(1)

    int ans = 0;
    int freq = 0;

    for(int i=0 ; i<nums.length ;i++){
        if(freq == 0){
            ans = nums[i];
            freq = 1;
        }
        else if(ans == nums[i]) freq++;
        else freq--;
    }

return ans;


    }
}

  /////////////// Better than brute force but not optimal///////////////////////////////////

        // Tc -> O(N)      
        // Sc -> O(N)      
        
        // HashMap <Integer,Integer> hm = new HashMap<>();

        
        // for(int i=0 ; i<nums.length ; i++){
        //     int num = nums[i];
        //     hm.put(num,hm.getOrDefault(num,0)+1);
        // }

        // for(int k: hm.keySet()){
        //     if(hm.get(k) > nums.length/2) return k;
        // }
        // return -1;
