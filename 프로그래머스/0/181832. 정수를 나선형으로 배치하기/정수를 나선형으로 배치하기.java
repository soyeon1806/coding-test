class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int start_row = 0;
        int end_row = n - 1;
        int start_col = 0;
        int end_col = n - 1;
        
        while(num <= n * n){
            for(int i = start_col; i <= end_col; i++){
                answer[start_row][i] = num++;
            }
            
            start_row++;
            
            for(int i = start_row; i <= end_row; i++){
                answer[i][end_col] = num++;
            }
            
            end_col--;
            
            for(int i = end_col; i >= start_col; i--){
                answer[end_row][i] = num++;
            }
            
            end_row--;
            
            for(int i = end_row; i >= start_row; i--){
                answer[i][start_col] = num++;
            }
            
            start_col++;
        }
        
        return answer;
    }
}