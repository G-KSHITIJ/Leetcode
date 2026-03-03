class Solution {
    public boolean checkPowersOfThree(int n) {
        String x = Integer.toString(n,3);
        if(x.contains("2")){
            return false;
        }
        // int sum = 0;
        // for(int i=1; i<16; i++){
        //     sum += Math.pow(3,i);
        //     if(sum == n){
        //         return true;
        //     }
        //     if(n % 10 == 1){
        //     sum += Math.pow(3,0);
        //     if (sum == n){
        //         return true;
        //     }
        // }
        // }
        
        return true;
    }
}