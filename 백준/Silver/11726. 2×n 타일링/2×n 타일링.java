
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[n + 1];

		System.out.println(recursion(n, dp));
	}

	static long recursion(int n, long[] dp) {
		if (dp[n] != 0)
			return dp[n];
		if (n <= 2)
			return dp[n] = n;
		return dp[n] = (recursion(n - 1, dp) % 10007 + recursion(n - 2, dp) % 10007) % 10007;
	}
}