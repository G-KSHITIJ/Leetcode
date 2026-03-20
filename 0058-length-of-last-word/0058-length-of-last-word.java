class Solution {
    public int lengthOfLastWord(String s) {
        String ans = s.trim();
        String str[] = ans.split("\\s+");
        if(str.length == 0) return 0;
        int n = str.length;
        return str[n-1].length();
    }
}