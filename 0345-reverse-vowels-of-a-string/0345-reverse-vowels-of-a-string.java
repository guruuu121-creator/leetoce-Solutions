class Solution {
    public String reverseVowels(String s) {
       char[] arr = s.toCharArray();
       int i = 0;
       int j = arr.length-1;
       while(i<j){
        while(i<j && !"aeiouAEIOU".contains(arr[i]+ "")){
            i++;
        }
         while(i<j && !"aeiouAEIOU".contains(arr[j]+ "")){
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       } 
       return new String(arr);
    }
}