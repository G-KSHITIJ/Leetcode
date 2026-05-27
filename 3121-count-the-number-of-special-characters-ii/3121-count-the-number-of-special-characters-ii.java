class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] small = new boolean [26];
        boolean[] caps = new boolean [26];
        boolean[] invalid = new boolean[26];
        boolean[] upperFirst = new boolean[26];

        for(char ch: word.toCharArray()){

            if(Character.isLowerCase(ch)){
                int idx = ch - 'a';

                if(caps[idx] || upperFirst[idx]){
                    invalid[idx] = true;
                }
                else small[idx] = true;
            }

            else{
                int idx = ch - 'A';

                if(!small[idx]){
                    upperFirst[idx] = true;
                }
                else{
                    caps[idx] = true;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            if(small[i] && caps[i] && !invalid[i]){
                ans++;
            }
        }
        return ans;
    }
}