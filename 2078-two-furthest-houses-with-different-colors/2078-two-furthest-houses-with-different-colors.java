class Solution {
    public int maxDistance(int[] colors) {
        int max_d = 0;
        int n = colors.length;
        for(int i=0; i<n; i++){
            if(colors[i] != colors[n-1]){
                max_d = Math.max(max_d, (n-1) - i);
            }
            if(colors[i] != colors[0]){
                if(max_d < i)
                    max_d = Math.abs(i);
            }
        }
        return max_d;
    }
}
