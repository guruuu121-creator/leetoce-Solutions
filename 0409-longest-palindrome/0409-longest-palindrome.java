class Solution {
    public int longestPalindrome(String s) {
     int[] freq = new int[128];
     for(char ch : s.toCharArray()){
        freq[ch]++;
     } 
     int ans = 0;
     boolean odd = false; 
     for(int f : freq){
        if(f%2==0){
            ans += f;
        }
        if(f%2!=0){
            ans += f-1;
            odd = true;
        }
     }
     if(odd){
        ans++;
     }
     return ans;
    }
}