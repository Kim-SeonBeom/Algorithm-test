import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        s = s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        ArrayList<String> list = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(" ")) {
                sb.append(list.get(i));
            } else for (int j = 0; j < list.get(i).length(); j++) {
                if (j == 0) {
                   sb.append((char) (list.get(i).charAt(j) - 32));
                } else if (j > 0 && j % 2 == 0) {
                    sb.append((char) (list.get(i).charAt(j) - 32));
                } else
                    sb.append((list.get(i).charAt(j)));
            }
        }
        result = sb.toString();
      
        return result;
    }
}