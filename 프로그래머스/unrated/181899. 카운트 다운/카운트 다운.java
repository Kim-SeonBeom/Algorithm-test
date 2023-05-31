class Solution {
    public int[] solution(int start, int end) {
        int x = start-end+1;
        int[] answer = new int[x];
        for(int i = 0; i<x; i++){
            answer[i] = start;
            System.out.println(start);
            start--;
        }
        
        return answer;
    }
}