class Solution {
    public boolean isAnagram(String s, String t) {
        //OPT. CODE:-
        if(s.length() != t.length()) return false;

        int[] count = new int[26];//HERE WE USED an array of 26 letters. 

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++; //when we found a char then the value at that index is incremented  by 1,
            count[t.charAt(i) - 'a']--; //value decremented by 1.
        }

        for(int c : count)
            if(c != 0) return false;

        return true;
        //TC = 20 MS 

        // if(s.length() != t.length()){
        //     return false;
        // }
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(int i=0; i<t.length(); i++){
        //     char ch = t.charAt(i);
        //     if(map.get(ch) != null){ // this line checks a value of != null
        //         if(map.get(ch) == 1){
        //             map.remove(ch);
        //         }
        //         else map.put(ch,map.get(ch)-1);
        //     }
        //     else return false;
        // }
        // return map.isEmpty();
    }
}