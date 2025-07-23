class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wallet_height = wallet [1];
        int wallet_width = wallet[0];
        
        int bill_width = bill[0];
        int bill_height = bill[1];
        
        int answer = 0;
        
        while(Math.min(bill_width, bill_height) > Math.min(wallet_width, wallet_height) || Math.max(bill_width, bill_height) > Math.max(wallet_width, wallet_height)){
            if(bill_width > bill_height){
                bill_width /= 2;
            }
            else{
                bill_height /= 2;
            }
            answer++;
        }
        
        return answer;
    }
}