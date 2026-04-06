class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length-1;
        // while(left <= right){
        //     int mid = left + (right - left)/2;
        //     if(target == nums[mid]){
        //         return true;
        //     }
        //     else if(target < nums[mid]){
        //         right = mid-1;
        //     }
        //     else left = mid + 1;
        // }
         return false;
    }
}