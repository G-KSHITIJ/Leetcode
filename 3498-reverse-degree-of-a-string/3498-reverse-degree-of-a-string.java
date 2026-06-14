class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char z = s.charAt(i);
            sum += ((26 - (z-'a')) * (i+1));
        }
        return sum;
    }
}