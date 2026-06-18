class Solution {
    public String sortSentence(String s) {
        String[] srr = s.split(" ");
        String[] arr = new String[srr.length];

        for(int i=0; i<srr.length; i++){
            String v = srr[i];
            int idx = (v.charAt(v.length()-1) - '0') - 1;
            arr[idx] = (v.substring(0,v.length()-1));
        }
        return String.join(" ",arr);
    }
}