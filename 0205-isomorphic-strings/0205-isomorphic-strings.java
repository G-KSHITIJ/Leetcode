class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() < t.length()) return false;

        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> rev_map = new HashMap<>();


        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            char key_2 = t.charAt(i);
            if(map.containsKey(key) && map.get(key) != key_2 || rev_map.containsKey(key_2) && rev_map.get(key_2) != key) {
                return false;
            }
            map.put(key,key_2);
            rev_map.put(key_2,key);
        }
        return true;
    }
}