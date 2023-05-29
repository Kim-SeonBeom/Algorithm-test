import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
                HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if(score.get(photo[i][j])==null){continue;}
                result[i] += score.get(photo[i][j]);
            }
        }
        return result;
    }
}