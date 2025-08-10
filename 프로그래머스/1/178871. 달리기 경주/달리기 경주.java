import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        String[] answer = players;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int idx = map.get(callings[i]);
            String name = answer[idx - 1];
            
            answer[idx - 1] = answer[idx];
            answer[idx] = name;
            map.put(answer[idx - 1], idx -1);
            map.put(answer[idx], idx);
        }
        
        return answer;
    }
}