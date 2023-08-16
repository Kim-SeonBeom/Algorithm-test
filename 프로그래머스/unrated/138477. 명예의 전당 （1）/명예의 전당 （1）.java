import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int curScore = 0;
        PriorityQueue<Integer> honor = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            honor.add(score[i]);
            if (honor.size() > k) {
                honor.poll();
                answer[i] = Math.max(curScore, honor.peek());
            } else if (honor.size() <= k) {
                answer[i] = Math.max(curScore, honor.peek());
            }
        }
        return answer;
    }
}