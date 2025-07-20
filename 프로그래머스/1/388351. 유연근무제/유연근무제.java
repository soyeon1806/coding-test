class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int[] flag = new int[n];
        
        int sunday = (6 - (startday - 1) + 7) % 7;
        int saturday = (5 - (startday - 1) + 7) % 7;
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            boolean on_time = true;
            
            int work_time = schedules[i];
            int work_time_hour = work_time / 100;
            int work_time_min = work_time % 100;
            int deadline = work_time_hour * 60 + work_time_min + 10;
                        
            for(int j = 0; j < 7; j++){
                if(j == saturday || j == sunday){
                    continue;
                }
                
                int real_time = timelogs[i][j];
                int real_time_hour = real_time / 100;
                int real_time_min = real_time % 100;
                int real = real_time_hour * 60 + real_time_min;
                
                if(real > deadline){
                    on_time = false;
                }
            }
            
            if(on_time){
                cnt++;
            }
        }
        
        return cnt;
    }
}