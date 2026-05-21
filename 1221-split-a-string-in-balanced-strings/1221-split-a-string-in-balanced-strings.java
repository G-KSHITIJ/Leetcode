class Solution {
    public int balancedStringSplit(String s) {
        int L = 0;
        int R = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') L++;
            if(ch == 'R') R++;

            if(L == R){
                ans++;
                L = 0;
                R = 0;
            }
        }
        return ans;
    }
}