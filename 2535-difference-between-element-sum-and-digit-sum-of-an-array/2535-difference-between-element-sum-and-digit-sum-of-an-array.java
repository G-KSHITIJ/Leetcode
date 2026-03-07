class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        for(int num: nums){
            element_sum += num;
        } 
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(num < 10) {
                sum += num;
            }
            else{
                while(num >= 10){
                int digit_sum = 0;
                while(num > 0){
                    digit_sum += num % 10;
                    num /= 10;
                }
                sum += digit_sum;
            }
            }
            
        }
        int ans = element_sum - sum;
        return ans;
    }
}