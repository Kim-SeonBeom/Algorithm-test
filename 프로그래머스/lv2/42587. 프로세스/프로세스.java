import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        int times = 1;
        int[] chk = new int[10];
        int max = 9;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
            chk[priorities[i]]++;
        }

        while (true) {
            if (chk[max] == 0) {
                max--;
                continue;
            }
            if(queue.peek()[1]!=max){
                queue.add(queue.poll());
            } else {
                if(queue.poll()[0]!=location){
                    times++;
                    chk[max]--;
                }else break;
            }
        }
        return times;
    }
}