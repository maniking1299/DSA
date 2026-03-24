class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res =new ArrayList<List<Integer>>(); 
        
        recur(nums,0,new ArrayList<Integer>(),res);
        return res;
    }
    private static void recur(int[] nums, int i ,List<Integer> curr , List<List<Integer>> res){
        
        if(i == nums.length){
           res.add(new ArrayList<>(curr));
            return;
        }
         curr.add(nums[i]);

        recur(nums,i+1,curr,res);

        curr.remove(curr.size()-1);

        recur(nums,i+1,curr,res);
    }
}