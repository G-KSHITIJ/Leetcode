class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int n = bills.length;
        for(int i=0; i<n; i++){
            if(bills[i] == 5){
                fives += 1;
            }
            else if(bills[i] == 10){
                tens += 1;
                if(fives > 0){
                    fives -= 1;
                }
                else return false;
            }
            else{
                if(tens > 0 && fives > 0){
                    tens -= 1;
                    fives -= 1;
                }
                else if(fives >= 3){
                    fives -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}