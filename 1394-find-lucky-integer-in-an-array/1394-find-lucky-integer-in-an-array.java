class Solution {
    public int findLucky(int[] arr) {
        //learn hashmap then do this 05/07/25
        //after learning hashmap - 19/03/26
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max_key = -1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val > max_key && key == val) max_key = Math.max(max_key,key);
        }
        return max_key;

        // int ans [] = new int [arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     int val = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             val++;                
        //         }
        //     }
        //     ans[i] = val;
        // }
        // for (int i = ans.length-1; i >= 0 ; i--) {
        //     if (arr[i] == ans[i]) {
        //         return arr[i];
        //     }
        // }
        // return -1;

        
    }
}