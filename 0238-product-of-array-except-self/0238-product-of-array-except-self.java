class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pre_prod = new int[n];
        int [] post_prod = new int[n];
        pre_prod[0] = 1;
        post_prod[n-1] = 1;

        for (int i = 1; i < n; i++) {
            pre_prod[i] = pre_prod[i-1] * nums[i-1]; 
        }
        for(int i=n-2; i>=0; i--){
            post_prod [i] = post_prod[i+1] * nums[i+1]; 
        }
    
        for(int i =0; i<pre_prod.length; i++){
            pre_prod[i] = pre_prod[i] * post_prod[i];
        }
        return pre_prod;
    }
}