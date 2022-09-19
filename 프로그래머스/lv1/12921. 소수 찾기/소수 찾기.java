class Solution {
    public int solution(int n) {
        int result = 0;
        int cnt = 0;
        int prime = 0;
        for(int i = 1; i <=n; i++){
            if (i < 2) {
                continue;
            }
            if (i == 2) {
                prime++;
                continue;
            }
            for (int j = 2; j < Math.sqrt((double)i)+1; j++) {
                if (i % j == 0) {
                    cnt++;
                    if(cnt>0){
                        break;
                    }
                }
            }
            if (cnt == 0) {
                prime++;
            }
            cnt = 0;
        }
        result = prime;
        return result;
    }
}