class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int lp = 0;
        int rp = 0;

        while(lp < players.length && rp < trainers.length){
            if(trainers[rp] >= players[lp]){
                lp++;
            }
            rp++;
        }        
        return lp;
    }
}