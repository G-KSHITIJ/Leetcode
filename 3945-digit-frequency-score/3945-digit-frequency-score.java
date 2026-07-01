class Solution {
    public int digitFrequencyScore(int n) {
        String s = Integer.toString(n);
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int ans = 0;
        // map.forEach((key, value) -> {
        //     int val = (key-'0') * value;
        //     ans += val;
        // });
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val = (entry.getKey()-'0')* (entry.getValue());
            ans += val;
        }
        return ans;
    }
}