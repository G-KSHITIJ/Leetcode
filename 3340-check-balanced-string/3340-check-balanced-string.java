class Solution {
    public boolean isBalanced(String num) {
        char[] ch = num.toCharArray();
        int even_sum = 0;
        int odd_sum = 0;

        for(int i=0; i<ch.length; i++){
            if(i % 2 == 0){
                even_sum += ch[i] -'0';
            }
            else odd_sum += ch[i] - '0';
        }
        if(even_sum == odd_sum) return true;
        else return false;
    }
}