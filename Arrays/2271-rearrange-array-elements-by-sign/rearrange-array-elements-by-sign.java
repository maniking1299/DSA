class Solution {
    public int[] rearrangeArray(int[] nums) {

 // Optimal Solution -> It uses only 1 array and 1 time traversal;
 // TC -> O(N)
 // SC -> O(N)

        int res[] = new int[nums.length];
        int positive = 0;
        int negative = 1;

        for(int i:nums){
            if(i<0){
                res[negative] = i;
                negative +=2;
            }else{
                res[positive] = i;
                positive +=2;
            }
        }

    return res;



///////////////////////////////////////////////////////////////////////////////////
// Brute force 
// TC -> O(n)
// SC -> O(n)

        // int pos[] = new int[nums.length/2];
        // int neg[] = new int[nums.length/2];
        // int j=0;
        // int k=0;

        // for(int i=0 ; i<nums.length ;i++){
        //     if(nums[i]<0){
        //         neg[j] = nums[i];
        //         j++;
        //     }else{

        //     pos[k] = nums[i];
        //     k++;
        //     }
            
        // }
        // j=0;
        // k=0;
        // for(int i=0 ; i<nums.length ;i++){
        //     if(i%2==0){
        //         nums[i] = pos[j];
        //         j++;
        //     }else{
        //         nums[i] = neg[k];
        //         k++;
        //     }
        // }

        // return nums;
    }
}