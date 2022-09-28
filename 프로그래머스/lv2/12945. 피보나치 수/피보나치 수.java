import java.util.*;
class Solution {
    public int solution(int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.offer(0);
        queue.offer(1);
        for(int i = 1; i <n+1; i++){
            if(i!=n){
                int data1 = queue.remove()%1234567;
                int data2 = queue.peek()%1234567;
                queue.offer((int)(data1 + data2));
            } else {
                queue.remove();
            }
        }
        int answer = queue.poll()%1234567;
        return answer;
    }
}