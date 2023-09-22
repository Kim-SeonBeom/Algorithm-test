import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int x, int y, int n) {
        int times = 0;
        Queue<Integer> waiting = new LinkedList<>();
        waiting.add(y);
        
        firstLoop:
        while (true) {
            int replay = waiting.size();
            if(replay == 0){
                return -1;
            }
            for (int i = 0; i < replay; i++) {
                if (waiting.peek() == x) {
                    break firstLoop;
                }
                if (waiting.peek() < x) {
                    return -1;
                }
                change(x, waiting.poll(), n, waiting, times);
            }
            times++;
        }
        return times;
    }
        
    public static void change(int x, int y, int n, Queue<Integer> waiting, int times) {
        if (y - n >= x) {
            waiting.add(y - n);
            // System.out.println(times + "회차 추가 숫자 : " + (y - n));
        }
        if (y / 2 >= x && y % 2 == 0) {
            waiting.add(y / 2);
            // System.out.println(times + "회차 추가 숫자 : " + (y / 2));
        }
        if (y / 3 >= x && y % 3 == 0) {
            waiting.add(y / 3);
            // System.out.println(times + "회차 추가 숫자 : " + (y / 3));
        }
    }

}