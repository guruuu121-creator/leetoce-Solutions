 class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      StringBuilder sn = new StringBuilder("");
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            sn.append(ch);
        }
      }
      return check(sn.toString());
    }
       boolean check(String s) {
         int left = 0;
         int right = s.length()-1;
         while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;
         }
         return true;
    }
}