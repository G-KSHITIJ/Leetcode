class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1){
                ans = key;
            }
        }
        return ans;
    }
}