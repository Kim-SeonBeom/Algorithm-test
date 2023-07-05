class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int left = 0;
        int right = 0;
        int result = 0;
        for (int i = 0; i < goal.length; i++) {
            if(left<cards1.length) {
                if (cards1[left].equals(goal[i])) {
                    left++;
                    continue;
                }
            }
            if(right<cards2.length) {
                if (cards2[right].equals(goal[i])) {
                    right++;
                    continue;
                }
            }
            result++;
            break;

        }
        if (result == 0) {
            answer = "Yes";
        } else answer = "No";
        return answer;
    }
}