class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revmap = new HashMap<>();

        for (int i = 0; i < pattern.length() ; i++) {
            char key = pattern.charAt(i);
            String val = str[i];
            if(map.containsKey(key) && !map.get(key).equals(val)){
                return false;
            }
            if(revmap.containsKey(val) && !revmap.get(val).equals(key)){
                return false;
            }

            map.put(key,val);
            revmap.put(val,key);

        }
        return true;
    }
}