class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return findBSets(nums,k,0, new HashMap<>());
    }
    public int findBSets(int[] nums,int k, int idx, HashMap<Integer, Integer> freqMap){
        if(idx == nums.length){
            if(freqMap.size() == 0) return 0;
            return 1;
        }
        int pick = 0;
        int ele = nums[idx] - k;
        if( freqMap.size() == 0 || !freqMap.containsKey(ele)){
            //include
            freqMap.put(nums[idx], freqMap.getOrDefault(nums[idx],0)+1);
            //explore
            pick = findBSets(nums, k, idx+1, freqMap);
            //backtrack
            freqMap.put(nums[idx], freqMap.get(nums[idx])-1);
            if(freqMap.get(nums[idx]) == 0){
                freqMap.remove(nums[idx]);
            }
        }
        int nopick = findBSets(nums, k, idx+1, freqMap);
        return pick + nopick; 
    }
}