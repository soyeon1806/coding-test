import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i= 0; i < photo.length; i++){
            int sum = 0;
            
            for(int j = 0; j < photo[i].length; j++){
                String person = photo[i][j];
                sum += map.getOrDefault(person, 0);
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}