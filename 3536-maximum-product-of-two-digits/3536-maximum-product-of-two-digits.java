class Solution {
    public int maxProduct(int n) {
        if(n<10) return n;
        
        int l = Integer.toString(n).length();
        int[] arr = new int [l];
        

        for(int i=l-1; i>=0; i--){
            arr[i] = n%10;
            n = n/10;
        }

        Arrays.sort(arr);
        
        int ans = arr[l-1] * arr[l-2];
        return ans;
    }
}