class Solution {
    public boolean checkDivisibility(int n) {
        int p = n;
        int sum = 0;
        int pro = 1;
        while(n>0){
            sum += n%10;
            pro *= n%10;
            n /= 10;
        }
        int fin = (sum + pro);
        // Prevent ArithmeticException if fin equals 0
        if (fin == 0) {
            return false;
        }

        return p % fin == 0;
    }
}