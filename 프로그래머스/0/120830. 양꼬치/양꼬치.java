class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer += n * 12000;
        answer += k * 2000;
        
        if(n >= 10){
            answer -= 2000 * (n / 10);
        }
        
        return answer;
    }
}