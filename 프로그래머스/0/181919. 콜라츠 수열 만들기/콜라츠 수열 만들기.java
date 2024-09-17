import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> num = new ArrayList<>();
        num.add(n);
        
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = 3 * n + 1;
            }
            num.add(n);
        }
        
        int[] answer = new int[num.size()];
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        
        return answer;
    }
}