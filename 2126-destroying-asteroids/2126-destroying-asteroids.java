class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);
        long val = mass;
        for(int as: asteroids){
            if(val >= as){
                val += as;
            }
            else return false;
        }
        return true;
    }
}