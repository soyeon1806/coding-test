class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        
        for(int i = 0; i < picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < picture[0].length(); j++){
                for(int l = 0; l < k; l++){
                    sb.append(picture[i].charAt(j));
                }
            }
            
            for(int j = 0; j < k; j++){
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}