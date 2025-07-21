class Solution {
    
    int toSecond(String time){
        String[] sub_time = time.split(":");
        int min = Integer.parseInt(sub_time[0]);
        int sec = Integer.parseInt(sub_time[1]);
        return min * 60 + sec;
    }
        
    String toTimeString(int time){
        int min = time / 60;
        int sec = time % 60;
        return String.format("%02d:%02d", min, sec);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {    
        
        int total = toSecond(video_len);
        int cur = toSecond(pos);
        int opStart = toSecond(op_start);
        int opEnd = toSecond(op_end);
        
        int n = commands.length;
        
        
        if(cur >= opStart && cur <= opEnd){
                cur = opEnd;
        }
        
        for(int i = 0; i < n; i++){
            if(commands[i].equals("prev")){
                cur = Math.max(0, cur - 10);
            }
            else if(commands[i].equals("next")){
                cur = Math.min(total, cur + 10);
            }
            if(cur >= opStart && cur <= opEnd){
                cur = opEnd;
            }
        }
        
        return toTimeString(cur);
    }
}