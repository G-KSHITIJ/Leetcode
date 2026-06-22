class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String val = String.join("",word1);
        String val2 =  String.join("",word2);

        if(val.length() != val2.length()) return false;

        for(int i=0; i<val.length(); i++){
            if(val.charAt(i) != val2.charAt(i)) return false;
        }
        return true;
    }
}