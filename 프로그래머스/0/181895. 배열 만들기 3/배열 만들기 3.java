import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
            result.add(arr[j]);
        }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}