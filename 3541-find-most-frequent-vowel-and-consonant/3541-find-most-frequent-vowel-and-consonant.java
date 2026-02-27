class Solution {
    public int maxFreqSum(String s) {
        int count_v = 0;
        int count_c = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char key: s.toCharArray()){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(isVowel(ch)){
                count_v = Math.max(count_v, freq);
            }
            else{
                count_c = Math.max(count_c, freq);
            }
        }
        return count_v + count_c;
    }
    private static boolean isVowel(char ch){
        if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
