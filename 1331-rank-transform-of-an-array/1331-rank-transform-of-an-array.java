class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();

        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int k=0;
        for(int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                k--;
                continue;
            }
            else{
                map.put(nums[i],i+k+1);
            }

        }
        for(int i=0; i<nums.length; i++){
            nums[i] = map.get(arr[i]);

        }
        return nums;
    }
}