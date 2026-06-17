class Solution {
    public int firstUniqChar(String s) {
        int[] nums = new int[26];
        for(char ch: s.toCharArray()){
            int idx = ch - 'a';
            nums[idx]++;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if(nums[idx] == 1)return i;
        }
        return -1;
    }
}