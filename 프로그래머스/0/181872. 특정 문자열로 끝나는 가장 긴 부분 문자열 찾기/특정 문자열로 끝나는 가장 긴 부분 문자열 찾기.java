class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = myString.length(); i >= pat.length(); i--){
            String sub = myString.substring(0, i);
            if(sub.endsWith(pat)){
                answer = sub;
                break;
            }
        }
        
        return answer;
    }
}