class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    public int backtrack(int[] nums,int idx, int currXOR){
        if(idx == nums.length){
            return currXOR;
        }

        int include = backtrack(nums, idx+1, currXOR ^ nums[idx]);
        int exclude = backtrack(nums, idx+1, currXOR);

        return include + exclude;
    }
}