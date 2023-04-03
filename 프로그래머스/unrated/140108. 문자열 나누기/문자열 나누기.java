class Solution {
    public int solution(String s) {
        int firstCnt = 0;
        int elseCnt = 0;
        int result = 1;
        int i = 0;
        while (i < s.length()) {
            if (firstCnt == elseCnt && firstCnt != 0 && elseCnt != 0) {
                s = s.substring(i);
                firstCnt = 0;
                elseCnt = 0;
                result++;
                i = 0;
                continue;
            }
            char x = s.charAt(0);
            if (x == s.charAt(i)) {
                firstCnt++;
            } else elseCnt++;
            i++;
        }
        
        return result;
    }
}