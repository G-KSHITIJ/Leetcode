class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
            //[2,5,4,12,16]
        }
        int totalsum = prefix[n-1];

        for(int i=0; i < n; i++){
            int leftsum = 0;
            if(i==0){
                leftsum = 0;
            }
            else{
                leftsum = prefix[i-1];
            }
            int rightsum = totalsum - prefix[i];
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}