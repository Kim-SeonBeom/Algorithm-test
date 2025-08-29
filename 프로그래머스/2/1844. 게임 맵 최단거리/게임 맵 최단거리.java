import java.util.*;

class Solution {
  
    public int solution(int[][] maps) {
    int[] mx = {0, -1, 0, 1}; //왼 위 오 아
    int[] my = {-1, 0, 1, 0};
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    while (!queue.isEmpty()) {
        int[] tmp = queue.poll();
        for (int i = 0; i < mx.length; i++) {
            int dx = tmp[0] + mx[i];
            int dy = tmp[1] + my[i];
            if (dy < 0) {//왼
                continue;
            }
            if (dx < 0) {//위
                continue;
            }
            if (dy >= maps[0].length) { //오
                continue;
            }
            if (dx >= maps.length) { //아
                continue;
            }
            if (maps[dx][dy] == 0) { //막힌데
                continue;
            }
            if (maps[dx][dy]>=2) { //갔던데
                continue;
            }
            // System.out.println("dx = " + dx);
            // System.out.println("dy = " + dy);
            queue.offer(new int[]{dx, dy});
            maps[dx][dy] = maps[tmp[0]][tmp[1]] + 1;
        }
        // for (int i = 0; i < maps.length; i++) {
        //     System.out.println(Arrays.toString(maps[i]));
        // }
        // System.out.println("----------");
    }

    int answer = maps[maps.length - 1][maps[0].length - 1] == 1 ? -1 : maps[maps.length - 1][maps[0].length - 1];
    System.out.println(answer);
    return answer; 

    }
}