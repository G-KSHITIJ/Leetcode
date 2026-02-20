class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] prefixsum = new int [n+1];
        prefixsum[0] = 0;

        for(int i=1; i<=n; i++){
            prefixsum[i] = gain[i-1] + prefixsum[i-1];
        }    
        int cs = prefixsum[0];
        for(int i=0; i<prefixsum.length; i++){
            cs = Math.max(prefixsum[i], cs);
        }
        return cs;
    }
}