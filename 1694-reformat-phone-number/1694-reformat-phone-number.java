class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for(char ch : number.toCharArray()){
            if(Character.isDigit(ch)){
                digits.append(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(digits.length() - i > 4){
            ans.append(digits.substring(i, i + 3));
            ans.append("-");
            i += 3;
        }
        if(digits.length() - i == 4){
            ans.append(digits.substring(i, i + 2));
            ans.append("-");
            ans.append(digits.substring(i + 2));
        }else{
            ans.append(digits.substring(i));
        }

        return ans.toString();
    }
}