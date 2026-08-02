class Solution {
    public int minLength(String s) {
     Stack<Character> st = new Stack<>();
     for(int i=0;i<s.length();i++){
        char cur_char = s.charAt(i);
        if(st.isEmpty()){
            st.push(cur_char);
            continue;
        }
        if(cur_char == 'B' && st.peek()=='A'){
            st.pop();
        }else if(cur_char == 'D' && st.peek()=='C'){
            st.pop();  
        }else{
            st.push(cur_char);
        }
     }
     return st.size();
    }
}