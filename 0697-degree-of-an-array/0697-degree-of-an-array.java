class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
         HashMap<Integer,Integer> first = new HashMap<>();
          HashMap<Integer,Integer> last = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            if (!first.containsKey(num)) {
                first.put(nums[i], i);
            }
            last.put(nums[i], i);
        }   
        int d = 0;
        for(int f : map.values()){
            d = Math.max(d,f);
        }
        int ans = nums.length;
        for(int num : map.keySet()){
            if(map.get(num)==d){
                int length = last.get(num)-first.get(num)+1;
                ans = Math.min(ans,length);
            }
        }
        return ans;
    }
}