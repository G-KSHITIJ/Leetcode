class Solution {
    public int minOperations(int[] nums, int k) {
        int totalsum = 0;
        int count = 0;
        for (int num : nums){
            totalsum += num;
        }
        if(totalsum < k){
            return totalsum;
        }
        else if(totalsum % k != 0){
            while(totalsum % k !=0){
                totalsum--;
                count++;
            }
            return count;
        }
        return 0;
    }
}