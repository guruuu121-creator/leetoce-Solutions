class Solution {
    public int lengthOfLastWord(String s) {
        String []arr=s.split(" ");
        int a=arr.length-1;
        int b=arr[a].length();
        return b;
}
}