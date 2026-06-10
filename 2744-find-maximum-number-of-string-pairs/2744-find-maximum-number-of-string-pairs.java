class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int pairs = 0;

        for(String s: words){
            String rev = "" + s.charAt(1) + s.charAt(0);
            if(set.contains(rev)){
                pairs++;
            }
            else{
                set.add(s);
            }
        }
        return pairs;
    }
}