class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int k = nums[i];
            while(k != 0){
                int ld = k%10;
                if(ld == digit) ans++;
                k /= 10;
            }
        }
        return ans;
    }
}