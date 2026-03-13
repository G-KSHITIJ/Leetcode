class Solution {
    public boolean isSubsequence(String s, String t) {
        int rp = 0;
        int lp = 0;
        int c = 0;
        while(lp<t.length() && rp < s.length()){
            if(s.charAt(rp) == t.charAt(lp)){
                rp++;
                c++;
            }
            lp++;
        }
        if(c < s.length()) return false;
        return true;
    }
}