class Solution {
    public String minWindow(String s, String t) {
     HashMap<Character,Integer> need = new HashMap<>();
     HashMap<Character,Integer> Window = new HashMap<>();
     for(char ch : t.toCharArray()){
        need.put(ch,need.getOrDefault(ch,0)+1);
     }   
     int required = need.size();
     int formed = 0;
     int left = 0;
     int minlen = Integer.MAX_VALUE;
     int start = 0;
     for(int right=0;right<s.length();right++){
        char ch = s.charAt(right);
        Window.put(ch,Window.getOrDefault(ch,0)+1);
        if(need.containsKey(ch) && Window.get(ch).intValue()==need.get(ch).intValue()){
            formed++;
        }
        while(formed==required){
            if(right-left+1<minlen){
                minlen = right-left+1;
                start = left;
            }
            char leftch = s.charAt(left);
            Window.put(leftch,Window.get(leftch)-1);
            if(need.containsKey(leftch)&& Window.get(leftch) < need.get(leftch)){
                formed--;
                }
                left++; 
        }
     }
     if(minlen == Integer.MAX_VALUE){
        return "";
    }
    return s.substring(start, start + minlen);
    }
}