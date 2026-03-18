class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder str = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            char key = entry.getKey();
            int val = entry.getValue();
            for (int i = 0; i < val; i++) {
                str.append(key);
            }
        }
        return str.toString();
    }
}