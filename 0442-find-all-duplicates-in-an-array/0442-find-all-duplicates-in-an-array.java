import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int lp = 0;
        int rp = 1;
        Arrays.sort(nums);
        while(rp<nums.length){
            if( nums[lp] == nums[rp]){
                list.add(nums[lp]);
            }
            lp++;
            rp++;
        }
        return list;
    }
}