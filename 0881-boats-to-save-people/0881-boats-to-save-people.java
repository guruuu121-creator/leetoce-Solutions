class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int a = 0;
        int b = people.length-1;
        int boats = 0;
        while(a<=b){
            if(people[a]+people[b]<=limit){
                a++;
                b--;
            }else{
                b--;
            }
            boats++;
        } 
        return boats;
    }
}