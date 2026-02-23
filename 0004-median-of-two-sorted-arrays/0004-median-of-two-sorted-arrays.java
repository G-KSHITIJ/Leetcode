class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //OPTIMAL SOLUTION
        int n = nums1.length;
        int m = + nums2.length;
        int v = n+m;
        int [] arr =  new int [v];
        int i=0,j=0,k=0;

        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i<n) arr[k++] = nums1[i++];
        while(j<m) arr[k++] = nums2[j++];
        //median
        if(v % 2 ==0){
            double ans = (arr[v/2] + arr[v/2-1]);
            return ans/2;
        }
        else{
            double ans = arr[v/2];
            return ans;
        }

        //MY SOLUTION

        // int v = nums1.length + nums2.length;
        // int [] arr =  new int [v];
        // int n = nums1.length;
        
        // for(int i=0; i<nums1.length; i++){
        //     arr[i] = nums1[i];
        // }
        // for(int i=0; i<nums2.length; i++){
        //     arr[n] = nums2[i];
        //     n++;
        // }
        // Arrays.sort(arr);
        // //median
        // if(v % 2 ==0){
        //     double ans = (arr[v/2] + arr[v/2-1]);
        //     return ans/2;
        // }
        // else{
        //     double ans = arr[v/2];
        //     return ans;
        // }
    }
}