class Solution {
    public int[] solution(String s) {
        int times = 0;
        int zeroCnt = 0;
        int cnt;
        while (s.length() != 1) {
            cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt++;
                }
            }
            zeroCnt += cnt;
            s = Integer.toBinaryString(s.length()-cnt);
            times++;
        }

        int[] answer = {times, zeroCnt};
        return answer;
    }
}