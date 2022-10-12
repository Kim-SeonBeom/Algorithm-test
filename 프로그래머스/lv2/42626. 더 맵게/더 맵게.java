import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while(pq.peek()<=K&&pq.size()>1){
           pq.add(pq.poll() + 2*pq.poll());
            cnt++;
        }
        if(pq.size() < 1 || pq.peek() <= K){
            return -1;
            
        }else return cnt;
      
    }
}