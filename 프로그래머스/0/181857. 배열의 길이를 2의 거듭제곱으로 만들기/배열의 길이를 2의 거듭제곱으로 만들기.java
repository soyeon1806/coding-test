class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        
        int pow = 1;
        
        while(pow < len){
            pow *= 2;
        }
        
        int answer[] = new int[pow];
        
        for(int i = 0; i < len; i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}