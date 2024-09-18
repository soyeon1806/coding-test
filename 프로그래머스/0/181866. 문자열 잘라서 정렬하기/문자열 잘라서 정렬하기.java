import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.trim().split("x");
        
        // 빈 문자열 제거
        List<String> filtered = Arrays.stream(answer)
                                      .filter(str -> !str.isEmpty()) // 빈 문자열 제거
                                      .collect(Collectors.toList());
        
        // 리스트를 배열로 변환한 후 정렬
        answer = filtered.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}