import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int sum = 0;
        Arrays.sort(score);
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        int i = score.length - 1;
        while (i >= 0) {
            min = Math.min(score[i], min);
            cnt++;
            i--;
            if (cnt == m) {
                sum += min * m;
                cnt = 0;
                continue;
            }
        }
        return sum;
    }
}