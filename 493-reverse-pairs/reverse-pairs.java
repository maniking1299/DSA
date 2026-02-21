class Solution {
    int cnt = 0;
    public int reversePairs(int[] nums) {

        mergeSort(nums,0,nums.length-1);
        return cnt;
    }

    private void mergeSort(int[] nums , int low , int high){
        if(low >= high)return;

        int mid = low+(high-low)/2;

        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }

    private void countPairs(int[] nums , int low , int mid ,int high){
        int right = mid+1;

        for(int i=low ; i<= mid; i++){
            while(right <= high && nums[i] > 2L*nums[right]) right++;

            cnt += (right-(mid+1));
        }
    }

    private void merge(int[] nums , int low , int mid , int high){

        List <Integer> list = new ArrayList<>();
        int left = low , right = mid+1;

        while(left<=mid && right<=high){
            if(nums[left] < nums[right]){
                list.add(nums[left++]);
            }else{
                list.add(nums[right++]);
            }
        }

        while(left<=mid){
            list.add(nums[left++]);
        }
        while(right<=high){
            list.add(nums[right++]);
        }

        for(int i=low ; i<=high ;i++ ){
            nums[i] = list.get(i-low);
        }
    }
}