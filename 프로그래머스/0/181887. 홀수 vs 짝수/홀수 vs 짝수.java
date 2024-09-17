class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd = 0;
        int even = 0;
        
        for(int i = 1; i < num_list.length + 1; i++){
            if(i % 2 == 0){
                odd += num_list[i - 1];
            }
            else{
                even += num_list[i - 1];
            }
        }
        
        answer = even >= odd ? even : odd;
        
        return answer;
    }
}