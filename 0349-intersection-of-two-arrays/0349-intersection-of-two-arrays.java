class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> set = new HashSet<>();
        for(int x:nums2){
            set.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> printed = new HashSet<>();
        for(int x : nums1){
            if(set.contains(x) && !printed.contains(x)){
                list.add(x);
                printed.add(x);
            }
        }
                int[] ans = new int[list.size()];
                for(int i = 0; i < list.size(); i++){
                    ans[i] = list.get(i);
            }
            return ans; 
    }
}