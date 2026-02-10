class Solution {
    public int[] rearrangeArray(int[] nums) {

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