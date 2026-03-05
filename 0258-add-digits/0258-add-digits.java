class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int digit_sum = 0;
            while(num > 0){
                digit_sum += num % 10;
                num /= 10;
            }
            num = digit_sum;
        }
        return num;
    }
}