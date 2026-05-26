class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                left++;
                count = Math.max(count,left);
            }
            if(c == ')'){
                left--;
            }
        }
        return count;
    }
}