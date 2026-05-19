class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int lp = 0;
        int rp = 0;
        int ans = -1;
        while(lp< nums1.length && rp < nums2.length){
            if(nums1[lp] < nums2[rp]){
                lp++;
            }
            else if(nums1[lp] == nums2[rp]) return nums1[lp];
            else rp++;
        }
        return -1;
    }
}