import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> alphabet = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alphabet.add(String.valueOf((char)(i+97)));
        }
        // System.out.println(alphabet.toString());
        for (int i = 0; i < skip.length(); i++) {
            alphabet.remove(skip.substring(i,i+1));
        }
        // System.out.println(alphabet.toString());
        for (int i = 0; i < s.length(); i++) {
            sb.append(alphabet.get((alphabet.indexOf(s.substring(i,i+1))+index)%(26-skip.length())));
        }
        String result = sb.toString();
        // System.out.println(result);

        return result;
    }
}