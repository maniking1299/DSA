class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


// Optimal solution -> 
// TC ->O(m+n)
// SC ->O(1)


    int i=m-1;
    int j=n-1;
    int k=m+n-1;

    while(i>=0 && j>=0){
        if(nums1[i]<nums2[j]){
            nums1[k--] = nums2[j--];
        }else{
            nums1[k--] = nums1[i--];
        }
    }

    while(j>=0){
        nums1[k--] = nums2[j--];
    }

    }
}

/////////////////////////////////////////////////////////////////////////////////

        // TC -> O(m+n)
        // SC -> O(m+n)

      /*  int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }
            else{
                ans[k++] = nums2[j++];
            }
        }
        
        while(i<m){
           ans[k++] = nums1[i++];
        }
        
        while(j<n){
            ans[k++] = nums2[j++];
        }

        for(int x=0;x<m+n;x++){
            nums1[x] = ans[x];
        }

       */
