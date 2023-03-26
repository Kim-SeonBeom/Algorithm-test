import java.util.Arrays;
class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = Arrays.copyOf(triangle, triangle.length);
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (i == 0) {
                    dp[i][j] = triangle[i][j];
                } else {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][0] + triangle[i][j];
                    } else if (j == triangle[i].length - 1) {
                        dp[i][j] = dp[i - 1][dp[i - 1].length - 1] + triangle[i][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[dp.length - 1][i], max);
        }
        
        return max;
    }
}