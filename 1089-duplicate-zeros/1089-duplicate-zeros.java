class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                shiftright(arr, i);
                if(i+1 < n){
                    arr[i+1] = 0;
                }
                i++;
            }
        }
    }
    public void shiftright(int[] arr, int j){
        for(int i=arr.length-1; i>j; i--){
            arr[i] = arr[i-1];
        }
    }
}