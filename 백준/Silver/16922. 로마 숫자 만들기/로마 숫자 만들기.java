
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static HashSet<Integer> set = new HashSet<>();
	static int[] nums = { 1, 5, 10, 50 };
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int sum = 0;
		combination(0, 0, sum);

		System.out.println(set.size());

	}

	static void combination(int depth, int start, int sum) {
		if (depth == n) {
			set.add(sum);
			return;
		}
		for (int i = start; i < nums.length; i++) {
			combination(depth + 1, i, sum + nums[i]);
		}
	}

}
