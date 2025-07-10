import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = -1;
		while (n != 0) {
			n = sc.nextInt();
			int[] nums = new int[n];
			boolean[] visit = new boolean[n];
			int[] tmp = new int[6];
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}
			conmbination(0, nums, visit, tmp, 0);
			System.out.println();
		}

	}

	static void conmbination(int depth, int[] nums, boolean[] visit, int[] tmp, int start) {
		if (depth == tmp.length) {
			for (int i = 0; i < tmp.length; i++) {
				System.out.print(tmp[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < nums.length; i++) {
			if (!visit[i]) {
				visit[i] = true;
				tmp[depth] = nums[i];
				conmbination(depth + 1, nums, visit, tmp, i + 1);
				visit[i] = false;
			}

		}

	}
}