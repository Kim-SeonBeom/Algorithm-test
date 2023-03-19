import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> word = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!word.containsKey(s.charAt(i))) {
                word.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                answer[i] = i - word.get(s.charAt(i));
                word.replace(s.charAt(i),i);
            }
        }
        return answer;
    }
}