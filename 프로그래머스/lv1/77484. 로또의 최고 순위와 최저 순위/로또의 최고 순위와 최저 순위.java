import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
         Set<Integer> win = new HashSet<>();
        Map<Integer,Integer> rank= new HashMap<>();
        for (int i = 6; i > 0; i--) {
            rank.put(i, 7-i);
        }
        rank.put(0,6);

        for (int i = 0; i < win_nums.length; i++) {
            win.add(win_nums[i]);
        }
        int cnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
            } else {
                if (win.contains(lottos[i])) {
                    cnt++;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = rank.get(cnt+zeroCnt);
        answer[1] = rank.get(cnt);
        return answer;
    }
}