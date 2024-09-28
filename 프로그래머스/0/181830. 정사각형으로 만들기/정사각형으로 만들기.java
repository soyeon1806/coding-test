class Solution {
    public int[][] solution(int[][] arr) {        
        int row = arr.length;
        int col = arr[0].length;
        
        int len = row > col ? row : col;
        
        int[][] answer = new int[len][len];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}