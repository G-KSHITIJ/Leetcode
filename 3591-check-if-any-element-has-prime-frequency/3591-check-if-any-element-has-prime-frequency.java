class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0) +1); // putting values in Hashmap 
        }
        int maxfreq = 0;
        for(int key: map.keySet()){
            int n = map.get(key);
            if(isprime(n)){
                return true;
            } 
        }
        return false;
    }
    public boolean isprime(int n){
        if (n <= 1) return false;
        for(int i=2; i * i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}