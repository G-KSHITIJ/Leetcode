class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int lp = 0;
        int rp = 0;
        
        while(lp < g.length && rp < s.length){
            if(s[rp] >= g[lp] ){
                lp++;
            }
            rp++;
        }
        return lp;
    }
}