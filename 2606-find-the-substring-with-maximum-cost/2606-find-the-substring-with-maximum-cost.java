class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] charval = new int[26];

        for(int i=0; i<26; i++){
            charval[i] = i+1; 
        }
        for(int i=0; i<chars.length(); i++){
            int idx = (chars.charAt(i)) - 'a';
            charval[idx] = vals[i]; 
        }
        int maxsum = 0;
        int currsum = 0;

        for(int i=0; i<s.length(); i++){
            int val = charval[s.charAt(i) - 'a'];

            currsum += val;
            if(currsum < 0){
                currsum = 0;
            }
            if(currsum> maxsum){
                maxsum = currsum;
            }
        }
        return maxsum;
    }
}