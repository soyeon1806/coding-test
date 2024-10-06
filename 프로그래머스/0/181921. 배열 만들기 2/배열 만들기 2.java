import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            if(check(i)){
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()){
            return new int[]{-1};
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    private static boolean check(int num){
    String str = Integer.toString(num);
    return str.matches("[05]+");
}
}