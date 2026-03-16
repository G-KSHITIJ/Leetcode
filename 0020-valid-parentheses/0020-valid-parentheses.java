class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char topchar = st.pop();
                if(ch == ')' && topchar != '('|| ch == '}' && topchar != '{'|| ch == ']' && topchar != '['){
                    return false;

                }
            }
        }
        return st.empty();
    }
}