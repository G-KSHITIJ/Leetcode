class Solution {
    public String removeOccurrences(String s, String part) {
        int partLen = part.length();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            sb.append(c);

            if(sb.length() >= partLen){
                String top = sb.substring(sb.length() - partLen);
                if(top.equals(part)){
                    sb.delete(sb.length() - partLen, sb.length());
                }
            }
        }
        return sb.toString();
    }
}