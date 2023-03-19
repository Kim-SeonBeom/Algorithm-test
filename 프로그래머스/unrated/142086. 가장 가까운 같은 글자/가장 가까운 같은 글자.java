import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> word = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!word.containsKey(String.valueOf(s.charAt(i)))) {
                word.put(String.valueOf(s.charAt(i)), i);
                answer[i] = -1;
            } else {
                answer[i] = i - word.get(String.valueOf(s.charAt(i)));
                word.replace(String.valueOf(s.charAt(i)),i);
            }
        }
        return answer;
    }
}