class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int last = num_list[num_list.length - 1];
        int last1 = num_list[num_list.length - 2];
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(last > last1){
            answer[num_list.length] = last - last1;
        }
        else{
            answer[num_list.length] = 2 * last;
        }
        
        return answer;
    }
}