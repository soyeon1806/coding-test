class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num = "";
        
        num += Integer.toString(a);
        num += Integer.toString(b);
        
        answer = Integer.parseInt(num);
        
        if(answer < 2 * a * b){
            answer = 2 * a * b;
        }
        
        return answer;
    }
}