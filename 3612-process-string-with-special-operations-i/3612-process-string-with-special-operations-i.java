class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            if(ch == '*' && sb.length() > 0){
                sb.deleteCharAt(sb.length()-1);
            }
            if(ch == '#' && sb.length() > 0){
                sb.append(sb.toString());
            }
            if(ch == '%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}