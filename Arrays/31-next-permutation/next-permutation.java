class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int pvt = -1;

        // Find pivot

        for(int i=n-2 ; i>=0;i--){
            if(nums[i]<nums[i+1]){
                pvt=i;
                break;
            }
        }

        // if there is no pivot

        if(pvt == -1){
           reverse(nums,0,n-1);
            return;
        }

        // we got the pivot then -> we find the just greater no than pivot
        for(int i=n-1 ; i>pvt ;i--){
            if(nums[i]>nums[pvt]){
                swap(nums,i,pvt);
                break;
            }
        } 

        // reverse the rest of the remaning array after pvt element.
        reverse(nums,pvt+1,n-1);


       
    }

    private  void swap(int[] nums , int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void reverse(int[] nums, int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}