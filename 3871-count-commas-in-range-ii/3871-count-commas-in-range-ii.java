class Solution {
    public long countCommas(long n) {
        long start = 1000;
        long result = 0;

        while(start <= n){
            result += ((n - start) + 1);
            start *= 1000;
        }
        return result;
    }
}