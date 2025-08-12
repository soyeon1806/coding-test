class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        boolean[] not_painted = new boolean[n];        
        for(int s : section){
            not_painted[s - 1] = true;
        }
        
        for(int i = 0; i < n; i++){
            if(not_painted[i]){
                answer++;
                    
                for(int j = 0; j < m && i + j < n; j++){
                    not_painted[i + j] = false;
                }
            }
        }      
        
        return answer;
    }
}