import java.util.Arrays;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num < pivot){
                list.add(num);
            }
            }
        for(int num : nums){
            if(num == pivot){
                list.add(num);
            }
            }
        for(int num : nums){
            if(num > pivot){
                list.add(num);
            }
        }
        int [] result = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}