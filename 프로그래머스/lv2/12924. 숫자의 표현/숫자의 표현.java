class Solution {
    public int solution(int n) {
        int cnt = 0;
        int start = 1;
        int sum = 0;
        while(start < n+1){
            for (int i = start; i <= n; i++) {
                if(sum==n){
                    cnt++;
                    start++;
                    sum = 0;
                    break;
                }
                if(sum>n){
                    sum = 0;
                    start++;
                    break;
                }
                sum += i;
            }
        }
        return cnt;
    }
}