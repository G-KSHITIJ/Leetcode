class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p = nums.length;
        int [] arr = new int[p];
        int lp = 0;
        int rp = n ;
        for(int i=0; i<p; i+=2){
            arr[i] = nums[lp];
            arr[i+1] = nums[rp];
            lp++;
            rp++;
        }
        return arr;
    }
}