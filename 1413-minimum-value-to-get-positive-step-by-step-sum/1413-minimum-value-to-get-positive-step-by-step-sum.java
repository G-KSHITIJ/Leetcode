class Solution {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        int[] ps = new int [nums.length];
        ps[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i-1] + nums[i];
            min = Math.min(min, ps[i]);
        }
        if(min > 0){
            return 1;
        }
        return Math.abs(min-1);
    }
}