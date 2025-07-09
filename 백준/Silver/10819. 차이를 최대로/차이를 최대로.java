import java.util.Scanner;

public class Main {
	static int globalSum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[n];
		boolean[] visit = new boolean[n];
		int[] tmp = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		permutation(0, nums, visit, tmp);
		System.out.println(globalSum);

	}

	static void permutation(int depth, int[] nums, boolean[] visit, int[] tmp) {
		if (depth == tmp.length) {
			int sum = 0;
			for (int i = 1; i < tmp.length; i++) {
				sum += Math.abs(tmp[i] - tmp[i - 1]);
			}
			globalSum = Math.max(globalSum, sum);
		}
		for (int i = 0; i < nums.length; i++) {
			if(!visit[i]) {
				visit[i]= true;
				tmp[depth] = nums[i];
				permutation(depth+1,nums,visit,tmp);
				visit[i]= false;
			}

		}

	}
}