class Solution {
    public int maxSubArray(int[] nums) {
      int current = 0;
      int max = Integer.MIN_VALUE;
      for(int num : nums){
        current = Math.max(num,current + num);
        max = Math.max(max,current);
      }  
      return max;
    }
}