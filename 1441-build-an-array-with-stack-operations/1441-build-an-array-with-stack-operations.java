class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> s = new Stack<>();
        List<String> list = new ArrayList<>();
        int j = 0;
        for(int i=1; i<=n; i++){
            s.push(i);
            if(j < target.length && s.peek() == target[j]){
                list.add("Push");
                j++;
            }
            else{
                s.pop();
                list.add("Push");
                list.add("Pop");
            }
            if(!s.isEmpty() && s.peek() == target[target.length-1]){
                break;
            }
        }
        return list;
    }
}