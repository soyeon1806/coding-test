import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            int[] prev = Arrays.copyOf(arr, arr.length);
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
                else if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }
            }
            
            answer++;
            
            if(Arrays.equals(arr, prev)){
                break;
            }
        }
        
        return answer - 1;
    }
}