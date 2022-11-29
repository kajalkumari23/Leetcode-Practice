class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'|| ch == '}' || ch == ']'){
                if(st.size() == 0){  //ncb > nob
                    return false;
                }
                if(ch ==')'&& st.peek()!='('){
                    return false;
                }
                if(ch == '}' && st.peek()!= '{'){
                    return false;
                }
                if(ch == ']' && st.peek()!= '['){
                    return false;
                }
                st.pop();
            }
        }
        if(st.size() > 0){
            return false;
        }
        return true;
    }
}

