class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ord = 0;
        int fr = 0;
        int arr[] = new int[friends.length];

        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i] == friends[j]){
                    arr[fr] = order[i];
                    fr++;
                }
            }
        }
        return arr;
    }
}