import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            if (intStrs[i].length() >= s + l) {
                int num = Integer.parseInt(intStrs[i].substring(s, s + l));
                if (num > k) {
                    answer.add(num);
                }
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
