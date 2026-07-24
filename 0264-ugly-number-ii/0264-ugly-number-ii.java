class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int i2 = 0,i3 = 0,i5 = 0;
        for(int i=1;i<n;i++){
            int a2 = ugly[i2]*2;
            int a3 = ugly[i3]*3;
            int a5 = ugly[i5]*5;
            int a = Math.min(a2,Math.min(a3,a5));
            ugly[i] = a;
            if(a==a2) i2++;
            if(a==a3) i3++;
            if(a==a5) i5++;
        }  
        return ugly[n-1];
    }
}