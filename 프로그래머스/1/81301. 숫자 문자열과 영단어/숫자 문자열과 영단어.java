import java.util.*;

class Solution {
    public int solution(String s) {
        int result = 0;
        HashMap<String, Integer> nums = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();
        nums.put("zero", 0);
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);
        nums.put("five", 5);
        nums.put("six", 6);
        nums.put("seven", 7);
        nums.put("eight", 8);
        nums.put("nine", 9);
        
        int idx = 0;
              for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1 && 48 <= s.charAt(i) && s.charAt(i) <= 57){
                sb.append(s.charAt(i));
            }else if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
                sb.append(s.charAt(i));
                idx=i+1;
            }
            if (nums.containsKey(s.substring(idx, i+1))) {
                    sb.append(nums.get(s.substring(idx, i+1)));
                    idx = i+1;
                    }
        }
        String X = sb.toString();
        result = Integer.parseInt(X);
        return result;
    }
}