class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int ans = Math.abs(i - map.get(key));
                if(ans <= k) return true;
            }
            map.put(key,i);    
        }
        return false;
    }
}