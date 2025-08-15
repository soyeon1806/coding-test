import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        boolean[] banned = new boolean[26];
        for(char ch : skip.toCharArray()){
            banned[ch - 'a'] = true;
        }
        
        
        for(char ch : s.toCharArray()){
            int moved = 0;
            char cur = ch;
            
            while(moved < index){
                cur++;
                
                if(cur > 'z'){
                    cur = 'a';
                }
                
                if(banned[cur - 'a']){
                    continue;
                }
                
                moved++;
            }
            
            sb.append(cur);
        }
        
        return sb.toString();        
    }
}