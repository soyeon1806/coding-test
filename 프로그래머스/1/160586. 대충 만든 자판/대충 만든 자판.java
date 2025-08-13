import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int answer[] = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                int press = i + 1;
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), press));
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            String t = targets[i];
            int sum = 0;
            boolean ok = true;
            
            for(int j = 0; j < t.length(); j++){
                char c = t.charAt(j);
                Integer p = map.get(c);
                
                if(p == null){
                    ok = false;
                    break;
                }
                
                sum+= p;
            }
            
            answer[i] = ok ? sum : -1;
        }
    
        return answer;
    }
}