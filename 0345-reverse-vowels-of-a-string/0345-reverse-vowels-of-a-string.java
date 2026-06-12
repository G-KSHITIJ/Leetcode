class Solution {
    public String reverseVowels(String s) {
        int lp = 0;
        int rp = s.length() - 1;
        char[] arr = s.toCharArray();
        while(lp < rp){
            if(isVowel(arr[lp])){
                while(lp < rp && !(isVowel(arr[rp]))){
                    rp--;
                }
                char ch = arr[lp];
                arr[lp] = arr[rp];
                arr[rp] = ch;
                lp++;
                rp--;
            }else{
                lp++;
            }
        }
        return new String(arr);
    }
    public static boolean isVowel(char c){
        if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u' ||
           c == 'A' || c=='E'|| c=='I' || c=='O' || c=='U'){
                return true;
        }
        return false;
    }
}