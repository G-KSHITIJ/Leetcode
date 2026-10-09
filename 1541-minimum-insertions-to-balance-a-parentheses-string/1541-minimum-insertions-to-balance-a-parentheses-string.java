class Solution {
    public int minInsertions(String s) {
        int insert = 0;
        int openNeed = 0;
        int i =0;
        int n = s.length();

        while(i<n){
            char ch = s.charAt(i);
            if(ch == '('){
                openNeed++;
                i++;
            }
            else{
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i+=2;
                }
                else{
                    insert++;
                    i++;
                }
                if(openNeed > 0){
                    openNeed--;
                }
                else{
                    insert++;
                }
            }
        }
        return insert + (openNeed * 2);
    }
}