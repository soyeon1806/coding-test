class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] expression = binomial.split(" ");
        
        int a = Integer.parseInt(expression[0]);
        int b = Integer.parseInt(expression[2]);
        String op = expression[1];
        
        switch(op){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}