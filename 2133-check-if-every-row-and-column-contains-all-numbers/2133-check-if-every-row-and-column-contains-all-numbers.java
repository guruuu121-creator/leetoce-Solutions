class Solution {
    public boolean checkValid(int[][] matrix) {
       int n = matrix.length;
        for(int i=0;i<n;i++){
            Set<Integer> RowSet = new HashSet<>();
             Set<Integer> ColSet = new HashSet<>(); 
             for(int j=0;j<n;j++){
                RowSet.add(matrix[i][j]);
                ColSet.add(matrix[j][i]);
             }  
             if(RowSet.size()!=n || ColSet.size()!=n){
                return false;
             }
       }
       return true;
    }
}