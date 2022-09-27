class Solution {
    public String solution(int a, int b) {
        int[] calendar = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weekofdays = {"THU", "FRI", "SAT","SUN", "MON", "TUE", "WED"};
        int c = 0;
        for(int i = 0; i < a-1; i++){
            c += calendar[i];
        }
        c += b;
        String answer = weekofdays[c%7];
        return answer;
    }
}