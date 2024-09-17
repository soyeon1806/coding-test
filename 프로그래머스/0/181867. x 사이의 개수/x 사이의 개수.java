import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        int sum = 0;
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer.add(sum);
                sum = 0;
            }
            else{
                sum++;
            }
        }
        
        answer.add(sum);
        
        return answer.stream().mapToInt(i ->i).toArray();
    }
}