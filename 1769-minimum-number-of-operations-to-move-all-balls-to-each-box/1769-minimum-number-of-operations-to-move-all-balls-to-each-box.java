class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int i = 0;
        int[] ans = new int[n];

        while(i<n){
            int j=0;
            int val = 0;
            while(j<n){
                int digit = boxes.charAt(j) - '0';
                if(digit == 1){
                    val += Math.abs(j-i);
                }
                j++;
            }
            ans[i] = val;
            i++;
        }
        return ans;
    }
}