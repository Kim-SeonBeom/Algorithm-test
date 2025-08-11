

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] dp;
	static int cnt = 1;
	static Queue<Integer> op = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[2 * n];
		dp[0] = Integer.MAX_VALUE;

		op.add(1);
      if(n!=1){
		while (dp[n] == 0) {
			operate(op.size());
			cnt++;
		}
      }

		System.out.println(dp[n]);

		sc.close();

	}

	public static void operate(int n) {
		while (n != 0) {
			int tmp = op.poll();
			if (tmp + 1 < dp.length - 1 && dp[tmp + 1] == 0) {
				dp[tmp + 1] = cnt;
				op.add(tmp + 1);
			}
			if (tmp * 2 < dp.length - 1 && dp[tmp * 2] == 0) {
				dp[tmp * 2] = cnt;
				op.add(tmp * 2);
			}
			if (tmp * 3 < dp.length - 1 && dp[tmp * 3] == 0) {
				dp[tmp * 3] = cnt;
				op.add(tmp * 3);
			}
			n--;
		}
	}
}
