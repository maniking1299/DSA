class Solution {
    public int trap(int[] height) {

//////////////////////Optmized Solution //////////////////////////////

        int left =0;
        int right =height.length-1;
        int leftMax=0;
        int rightMax=0;
        int maxTrap = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }else{
                    maxTrap +=leftMax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax = height[right];
                }else{
                    maxTrap +=rightMax-height[right];
                }
                right--;
            }
        }

        return maxTrap;
    }
}
///////////////////////////////////////////////////////////////////////////////////
/*
        // TC->O(N)
        // SC->O(N)
        
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        leftmax[0] = height[0];

        for(int i=1 ;i<height.length ;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        rightmax[height.length - 1] = height[height.length-1];

        for(int i=height.length-2 ;i>=0 ;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int waterLevel = 0;
        for(int i=0 ;i<height.length ;i++){
            int trp = Math.min(leftmax[i] , rightmax[i])-height[i];

            if(trp >0){
                waterLevel += trp;
            } 
        }

        return waterLevel;  */
