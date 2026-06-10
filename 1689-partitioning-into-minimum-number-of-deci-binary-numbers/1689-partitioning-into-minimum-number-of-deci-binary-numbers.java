class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for(char c:n.toCharArray()){
            int digit = c - '0';
            if(digit > max){
                max = digit;
            }
            if(max==9) return max;
        }
        return max;
    }
}