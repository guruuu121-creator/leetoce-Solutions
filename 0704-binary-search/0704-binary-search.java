class Solution {
    public int search(int[] nums, int target) {
       int max =0;
      int min = nums.length-1;
      while(max<=min){
        int mid = max + (min-max)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
             max= mid+1;
        }else{
            min= mid-1;
        }
      }  
      return -1; 
    }
}