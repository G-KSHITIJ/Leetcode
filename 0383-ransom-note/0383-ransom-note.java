class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return  false;
        HashMap<Character,Integer> rn = new HashMap<>();
        HashMap<Character,Integer> mg = new HashMap<>();
        boolean bool = false;

        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            rn.put(key, rn.getOrDefault(key,0)+1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char key = magazine.charAt(i);
            mg.put(key, mg.getOrDefault(key,0)+1);
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            char key = ransomNote.charAt(i);
            if(!mg.containsKey(key) || (mg.get(key) < rn.get(key))) {
                return false;
            }
        }
        return true;
    }
}