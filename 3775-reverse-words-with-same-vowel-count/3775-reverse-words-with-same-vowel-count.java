class Solution {
   public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int first_vc = vowelCount(arr[0]);

        for(int i=1; i<arr.length; i++){
            String v = arr[i];
            int second_vc = vowelCount(v);
            if(second_vc == first_vc){
                arr[i] = reverseString(v);
            }
        }
        return String.join(" ", arr);
    }

    public static String reverseString(String v){
        int lp=0;
        int rp=v.length()-1;
        char[] s = v.toCharArray();

        while(lp<rp){
            char ch = s[lp];
            s[lp] = s[rp];
            s[rp] = ch;
            lp++;
            rp--;
        }
        return new String(s);
    }
    public static boolean isVowel(char c){
        if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public static int vowelCount(String v){
        int count = 0;
        for(int i=0; i<v.length(); i++){
            char ch = v.charAt(i);
            if(isVowel(ch)) count++;
        }
        return count;
    }
}