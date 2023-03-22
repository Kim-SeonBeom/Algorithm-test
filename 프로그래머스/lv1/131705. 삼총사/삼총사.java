class Solution {
    int cnt = 0;
    public int solution(int[] number) {
        int n = number.length;
        boolean[] visited = new boolean[n];
        combination(number, visited, 0, n, 3);
        return cnt;
    }
     void combination(int[] number, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
           int sum = 0 ;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum+=number[i];
            }
        }
        if(sum==0){
            cnt++;
        }
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(number, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}