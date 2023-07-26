class Solution {
    public int solution(int number, int limit, int power) {
        int cnt = 0;
        int result = 0;
        for (int i = 1; i <= number; i++) {
             for (int j = 1; j *j <= i; j++) {
                if (j *j == i) {
                    cnt++;
                }else if(i%j ==0) cnt +=2;
            }
            if (cnt <= limit) {
                result += cnt;
            } else result += power;
            cnt = 0;
        }
        return result;
    }
}