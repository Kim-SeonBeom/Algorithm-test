import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            if(visited[i]){
                continue;
            }
            stack.push(i);
            while(!stack.isEmpty()){
                int tmp = stack.pop();
                if(visited[tmp]){
                    continue;
                }
                visited[tmp] = true;
                for(int j = 0; j<computers[tmp].length; j++){
                    if(computers[tmp][j]==0){
                        continue;
                    }
                    if(tmp !=j){
                        stack.push(j);
                    }
                }
            }
            answer++;
        }
        return answer;
    }
}