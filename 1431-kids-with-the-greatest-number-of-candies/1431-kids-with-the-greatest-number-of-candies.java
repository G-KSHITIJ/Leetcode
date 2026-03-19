class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int num:candies){
            if(num>max) max=num;
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int val = candies[i] + extraCandies;
            if(val >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}