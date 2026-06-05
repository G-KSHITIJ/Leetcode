class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for(int st: students){
            count[st]++;
        }

        for(int sd: sandwiches){
            if(count[sd] == 0){
                break;
            }
            count[sd]--;
        }
        return count[0] + count[1];
    }
}