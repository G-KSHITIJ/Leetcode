class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        for(int n: nums){
            small = Math.min(small, n);
            large = Math.max(large, n);
        }
        return gcd(small, large);
    }
    public int gcd(int small, int large){
        while(large != 0){
            int temp = large;
            large = small % large;
            small = temp;
        }
        return small;
    }
}