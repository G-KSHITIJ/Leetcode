class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        // int s = 0;
        // int e = nums.length-1;
        
        // while(s <= e){
        //     int mid = s + (e-s)/2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[s] <= target && target < nums[mid]){// condition referenced from google😢;
        //         e = mid-1;
        //     }
        //     else{
        //         s = mid+1;
        //     }
        // }
        return -1;
    }
}