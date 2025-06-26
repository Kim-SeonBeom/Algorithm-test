import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[10];

		while (n != 0) {
			nums[n % 10]++;
			n /= 10;

		}
		int x = nums[6] + nums[9];
		if (x % 2 == 1) {
			nums[6] = x / 2 + 1;
			nums[9] = x / 2;
		} else {
			nums[6] = x / 2;
			nums[9] = x / 2;
		}
//		System.out.println();
//		System.out.println(Arrays.toString(nums));
		int max = Integer.MIN_VALUE;
		for (int item : nums) {
			max = max < item ? item : max;
		}
		System.out.println(max);
		sc.close();
	}
}