class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s: sentences){
            String[] arr = s.split("\\s+");
            int count = arr.length;
            if(count > ans) ans = count;
        }
        return ans;
    }
}