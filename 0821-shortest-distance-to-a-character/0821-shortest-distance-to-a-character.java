class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int prev = -10000; //acts like -infinity
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                prev = i;
            }
            arr[i] = i - prev;
        }

        prev = 10000; //acts like + infinty
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == c){
                prev = i;
            }
            arr[i] = Math.min(arr[i], prev-i);
        } 
        return arr;
    }
}