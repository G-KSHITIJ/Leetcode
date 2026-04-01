class Solution {
    public int alternateDigitSum(int n) {
        int result = 0;

        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            if(i % 2 ==0){
                result += digit;
            }
            else{
                result -= digit;
            }
        }
        return result;
    }
}