class Solution {
    public String firstPalindrome(String[] words) {
        for(String str: words){
            String s = new StringBuilder(str).reverse().toString(); 
            if(s.equals(str)) return str;
        }
        return "";
    }
}