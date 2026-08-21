class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int a=0;
        int b=n;
        int last = nums[n];
        while(a<b){
            int mid = (a+b)/2;
            if(nums[mid]>last)  a = mid+1;
            else b = mid;
        } 
        return nums[a];
    }
}