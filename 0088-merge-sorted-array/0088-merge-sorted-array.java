class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;        
        for (int i = 0; i < nums2.length; i++) {
            nums1[k] = nums2[i];
            k++;
        }
        Arrays.sort(nums1);
    }
}