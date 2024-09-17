import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
