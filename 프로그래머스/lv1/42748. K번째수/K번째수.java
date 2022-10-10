import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]-1; j <= commands[i][1]-1;j++) {
                al.add(array[j]);
            }
            Collections.sort(al);
            result[i] = al.get(commands[i][2]-1);
            al.clear();
        }
        return result;
    }

}