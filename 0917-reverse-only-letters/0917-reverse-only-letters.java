class Solution {
    public String reverseOnlyLetters(String s) {
        char [] ch = s.toCharArray();
        int lp = 0;
        int rp = ch.length-1;
        while(lp<rp){
            if(!Character.isLetter(ch[lp])){
                lp++;
            }else if(!Character.isLetter(ch[rp])){
                rp--;
            }
            else{
                char b = ch[lp];
                ch[lp] = ch[rp];
                ch[rp] = b;
                lp++;
                rp--;
            }
        }

        return String.valueOf(ch);
    }
}