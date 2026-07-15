class Solution {
    public int gcdOfOddEvenSums(int n) {
        // Sum of first n odd numbers = n²
        // Sum of first n even numbers = n(n + 1)
        // gcd(n², n(n + 1))
        // = n * gcd(n, n + 1)
        // Since consecutive numbers are coprime, gcd(n, n + 1) = 1
        // Therefore, the answer is n.
        return n;
    }
}