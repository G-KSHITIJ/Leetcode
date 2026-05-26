class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] small = new int[26];
        int[] caps = new int[26];
        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)){
                small[ch-'a']++;
            }
            if(Character.isUpperCase(ch)){
                caps[ch-'A']++;
            }
        }
        for(int i=0; i<26; i++){
            if(small[i] >= 1 && caps[i] >= 1){
                ans++;
            }
        }
        return ans;
    }
}