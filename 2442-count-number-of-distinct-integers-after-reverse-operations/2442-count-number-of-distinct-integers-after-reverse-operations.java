class Solution {
    public int countDistinctIntegers(int[] nums) {
        //OPTIMIZED CODE
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();
    }


    private int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
    }
} 

        // MY CODE
        // int n = nums.length;
        // int arr [] = new int[n+n];
        // for(int i=0; i<n; i++){
        //     int x = nums[i];
        //     int rev = 0;
        //     while(x != 0){
        //         int lastdigit = x % 10;
        //         rev = rev * 10 + lastdigit; 
        //         x/=10;
        //     }
        //     arr[i] = nums[i];
        //     arr[n+i] = rev;
        // }
        // Set<Integer> val = new HashSet<>(); 
        // for(int k : arr){
        //     val.add(k);
        // }
        // int ans = val.size();
        // return ans;
//     }
// }