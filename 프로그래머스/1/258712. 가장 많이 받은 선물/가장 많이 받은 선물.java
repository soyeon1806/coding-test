class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = gifts.length;
        int m = friends.length;
        
        int[][] cnt = new int[m][m];
        int[] give_total = new int[m];
        int[] receive_total = new int[m];
        int[] answer = new int[m];
        
        for(int i = 0; i < n; i++){
            String[] gift = gifts[i].split("\\s");
            String giver = gift[0];
            String receiver = gift[1];
            
            int row = 0, col = 0;
            
            for(int j = 0; j < m; j++){
                if(giver.equals(friends[j])){
                    row = j;
                    give_total[j]++;
                }
                
                if(receiver.equals(friends[j])){
                    col = j;
                    receive_total[j]++;
                }
            }
            
            cnt[row][col]++;
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(i == j){
                    continue;
                }
                
                if(cnt[i][j] > cnt[j][i]){
                    answer[i]++;
                }
                else if(cnt[i][j] < cnt[j][i]){
                    answer[j]++;
                }   
                else{
                    int tmp1 = give_total[i] - receive_total[i];
                    int tmp2 = give_total[j] - receive_total[j];
                    
                    if(tmp1 > tmp2){
                        answer[i]++;
                    }
                    else if(tmp1 < tmp2){
                        answer[j]++;
                    }
                }
                
            }
        }
        
        int max = 0;
        for(int i = 0; i < m; i++){
            if(answer[i] > max){
                max = answer[i];
            }
        }
        
        return max / 2;
    }
}