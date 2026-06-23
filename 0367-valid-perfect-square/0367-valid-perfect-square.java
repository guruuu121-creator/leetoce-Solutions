class Solution {
    public boolean isPerfectSquare(int num) {
         long a = 1;
         long b = num;
         while(a<=b){
            long mid = a+(b-a)/2;
            long square = mid*mid;
            if(square==num){
                return true;
            }else if(square<num){
                a = mid+1;
            }else{
                b = mid-1;
            }
         }
         return false;
    }
}