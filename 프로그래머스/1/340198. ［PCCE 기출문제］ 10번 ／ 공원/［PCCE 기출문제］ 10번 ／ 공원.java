import java.util.*;

class Solution {
    
    private boolean calculate(String[][] park, int x, int y, int size){
        
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public int solution(int[] mats, String[][] park) {
        int width = park[0].length;
        int height = park.length;
        
        Arrays.sort(mats);
       
        for(int k = mats.length - 1; k >= 0; k--){
            int size = mats[k];
            
            for(int i = 0; i <= height - size; i++){
                for(int j = 0; j <= width - size; j++){
                    if(calculate(park, i, j, size)){
                        return size;
                    }
                }
            }
        }
        
        return -1;
    }
}