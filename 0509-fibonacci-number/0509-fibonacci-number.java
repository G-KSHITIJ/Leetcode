class Solution {
    public int fib(int n) {
        int sum;
        if(n < 2){
            return n;
        }
        return sum = fib(n-2) + fib(n-1);
    }
}