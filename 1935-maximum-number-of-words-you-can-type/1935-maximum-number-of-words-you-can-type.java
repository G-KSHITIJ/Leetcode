class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        String words[] = text.split(" ");
        for(String word : words){
            boolean cantype = true;
            for(char c : word.toCharArray()){
                if(brokenLetters.indexOf(c) != -1){ //If character c exists inside brokenLetters Then the letter is broken.
                    cantype = false;
                }
            }
            if(cantype){
                ans++;
            }
        }
        return ans;
    }
}