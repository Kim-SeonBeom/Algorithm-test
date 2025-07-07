
import java.util.Scanner;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		boolean[] visited = new boolean[n];
		int sum = 0;
		
		combination(nums, visited,0,  s, sum);
		System.out.println(cnt);

	}

	static void combination(int[] nums, boolean[] visited, int start, int s, int sum) {

		for (int i = start; i < nums.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				sum += nums[i];
				if (sum == s) {
					cnt++;
				}
				combination(nums, visited,i+1,  s, sum);
				visited[i] = false;
				sum -= nums[i];
			}
		}

	}

}
