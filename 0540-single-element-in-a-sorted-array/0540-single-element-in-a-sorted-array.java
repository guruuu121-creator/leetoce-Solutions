class Solution {
    public int singleNonDuplicate(int[] nums) {
     int a = 0;
     int b = nums.length-1;
     while(a<b){
        int mid = a+(b-a)/2;
        if(mid%2==1) mid--;
        if(nums[mid] == nums[mid+1]) a = mid+2;
        else b = mid;
     }   
     return nums[a];
    }
}