class Solution {
    public String removeDuplicates(String s) {
     StringBuilder prevchar = new StringBuilder();
     for(int i=0;i<s.length();i++){
        char currchar = s.charAt(i);
        if(prevchar.length()>0 && prevchar.charAt(prevchar.length()-1) == currchar){
            prevchar.deleteCharAt(prevchar.length()-1);
        } else{
            prevchar.append(currchar);
        }
          }   
          return prevchar.toString();
    }
}