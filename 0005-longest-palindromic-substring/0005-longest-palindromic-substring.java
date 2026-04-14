class Solution {
    public String longestPalindrome(String s) {
      int start=0;
        int end=0;
        if(s==null ||s.length()<1) return "";
        for(int i=0;i<s.length();i++){
            int oddLen=expandCentre(s,i,i);
            int evenLen=expandCentre(s,i,i+1);
            int maxLen=Math.max(oddLen, evenLen);

            if(maxLen> end -start){
                start=i-(maxLen-1)/2;
                end=i+ maxLen/2;
            }
        }
       return s.substring(start,end+1);  
    }
     private static int expandCentre(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}