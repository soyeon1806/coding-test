class Solution {
    public int solution(int a, int b) {        
        String num_a = Integer.toString(a);
        String num_b = Integer.toString(b);
        
        String ab = num_a + num_b;
        String ba = num_b + num_a;
        
        int num1 = Integer.parseInt(ab);
        int num2 = Integer.parseInt(ba);
        
        if(num1 < num2){
            return num2;
        }
        else {
            return num1;
        }
    }
}