 class Solution {
    public int largestAltitude(int[] gain) {
        int power = 0;
        int maxAltitude=0;
        for(int i=0;i<gain.length;i++){
            power= power + gain[i];
            maxAltitude=Math.max(power,maxAltitude);
        }
        return maxAltitude; 
    }
 }