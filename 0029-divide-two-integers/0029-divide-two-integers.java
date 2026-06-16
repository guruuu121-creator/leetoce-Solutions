 class Solution {
    public int divide(int dividend, int divisor) {
         int result;
        if(dividend<0 && divisor<0){
            result=dividend/divisor;
            if(result<0){
            result=(dividend/divisor)-1;
            }
        }else{
            result=dividend/divisor;
        }
        return result;
 }
 }