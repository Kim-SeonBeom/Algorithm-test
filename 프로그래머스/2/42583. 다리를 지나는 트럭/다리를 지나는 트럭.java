import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int curWeight = 0;
        int time = 0;

        Queue<Integer> onBridge = new LinkedList<>();
        int idx = 0;
        while (idx < truck_weights.length) {
            if(onBridge.size()==bridge_length){
                curWeight-=onBridge.poll();
            }
            if (curWeight + truck_weights[idx] <= weight&&onBridge.size()<=bridge_length) {
                curWeight += truck_weights[idx];
                onBridge.add(truck_weights[idx]);
                time++;
                idx++;
            } else {
                onBridge.add(0);
                time++;
            }
        }
      
        return time + bridge_length;
    }
}