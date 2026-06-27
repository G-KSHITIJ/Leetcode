class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key: nums){
            map.put(key,map.getOrDefault(key,0)+ 1);
        }
        int[] arr = new int[2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                arr[i] = entry.getKey();
                i++;
            }
        }
        return arr;
    }
}