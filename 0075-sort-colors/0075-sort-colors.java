class Solution {
    public void sortColors(int[] nums) {
         //code using selection sort
         for(int i=0;i<nums.length;i++){
         int last = nums.length-i-1;
         int max = getindex(nums,0,last);
         int temp = nums[max];
         nums[max] = nums[last];
         nums[last] = temp;
    }
    }
    public static int getindex(int[] nums,int start,int end){
    int max = start;
    for(int i=start;i<=end;i++){
        if(nums[max]<nums[i]){
            max = i;
        }
    }
    return max;
    }
}