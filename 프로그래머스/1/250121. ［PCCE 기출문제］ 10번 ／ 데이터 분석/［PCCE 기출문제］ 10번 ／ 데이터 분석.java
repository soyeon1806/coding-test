import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String , Integer> indexMap = new HashMap<>();
        indexMap.put("code", 0);
        indexMap.put("date", 1);
        indexMap.put("maximum", 2);
        indexMap.put("remain", 3);
        
        int extIndex = indexMap.get(ext);
        int sortIndex = indexMap.get(sort_by);
        
        List<int[]> filtered = new ArrayList<>();
        for(int[] d : data){
            if(d[extIndex] < val_ext){
                filtered.add(d);
            }
        }
        
        filtered.sort(Comparator.comparingInt(o -> o[sortIndex]));
        
        int[][] answer = new int[filtered.size()][];
        for(int i = 0; i < filtered.size(); i++){
            answer[i] = filtered.get(i);
        }
        
        return answer;
    }
}