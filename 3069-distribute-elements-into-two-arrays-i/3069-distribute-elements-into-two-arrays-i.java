class Solution {
    public int[] resultArray(int[] nums) {
      int n = nums.length;
      int[] arr1 = new int[n];
      int[] arr2 = new int[n];
      int i1=0;
      int i2=0;
      // initialize first two element
      arr1[i1++] = nums[0];
      arr2[i2++] = nums[1];
      // Distribute remaining elementbased on last appended value
      for(int i=2;i<n;i++){
        if(arr1[i1-1]>arr2[i2-1]){
            arr1[i1++] = nums[i];
        }else{
            arr2[i2++] = nums[i];
        }
      }
      //concatenate arr1 and arr2 into result array
      int[] res = new int[n];
      int index = 0;
      for(int i=0;i<i1;i++){
        res[index++] = arr1[i];
      }  
     for(int j=0;j<i2;j++){
        res[index++] = arr2[j];
      }  
      return res;
    }
}