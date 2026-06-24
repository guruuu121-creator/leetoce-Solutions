class Solution {
    public double[] convertTemperature(double Celsius){
        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.80 + 32.00;
        double[] ans = {Kelvin,Fahrenheit};
        return ans;
    }
}