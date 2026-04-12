class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<banned.length; i++){
            int key = banned[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int sum = 0; 
        int count = 0;

        for(int i=1; i<=n; i++){
            if(!(map.containsKey(i)) && sum <= maxSum){
                sum += i;
                if(sum <= maxSum) count++;
            }
        }
        return count;
    }
}