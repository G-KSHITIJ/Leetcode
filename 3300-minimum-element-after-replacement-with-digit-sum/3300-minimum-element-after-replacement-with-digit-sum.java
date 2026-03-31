class Solution {
    public int minElement(int[] nums) {
        int [] arr = new int[nums.length];
        int min = nums[0];
        for(int i=0; i < nums.length; i++){
            arr[i] = sumDigits(nums[i]);
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }
}