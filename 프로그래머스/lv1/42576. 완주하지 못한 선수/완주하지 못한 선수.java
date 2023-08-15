import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
                HashMap<String, Integer> notComplete = new HashMap<>();
        for (String x : participant) {
            if (notComplete.containsKey(x)) {
                notComplete.put(x, notComplete.get(x) + 1);
            }else            notComplete.put(x, 1);
        }
        for (String x : completion) {
            if (notComplete.containsKey(x) && notComplete.get(x) > 1) {
                notComplete.put(x, notComplete.get(x) - 1);
            } else if (notComplete.containsKey(x) && notComplete.get(x) == 1) {
                notComplete.remove(x);
            }
        }
        String s = "";
        for (String key : notComplete.keySet()) {
            // 키와 매핑된 값이랑 equals() 메서드에 전달된 값이랑 일치하면 반복문을 종료합니다.
            if (notComplete.get(key).equals(1)) { // 키가 null이면 NullPointerException 예외 발생
                s = key;
                break;
            }
        }
        return s;
    }
}