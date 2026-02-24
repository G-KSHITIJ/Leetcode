class Solution {
    public int alternatingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int evensum = 0;
        int oddsum = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                evensum += nums[i];
            }
            else oddsum += nums[i];
        }
        return evensum-oddsum;
    }
}