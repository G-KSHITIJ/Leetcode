class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toLowerCase()) || word.equals(word.toUpperCase())){
            return true;
        }
        String titleCase = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return word.equals(titleCase);
    }
}