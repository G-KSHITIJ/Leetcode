class Solution {
    public int smallestNumber(int n, int t) {

        for(int i=n; i<n+10; i++){
            int v = i; 
            int prod = 1;
            // int ans = i;
            while(v != 0){
                prod *= v % 10;
                v /= 10;
            }
            if(prod % t == 0){
                return i;
            }
        }
        return 0;
    }
}