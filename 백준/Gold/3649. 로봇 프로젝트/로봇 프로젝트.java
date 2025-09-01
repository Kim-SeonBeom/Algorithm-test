import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		while ((s = br.readLine()) != null) {
			int x = Integer.parseInt(s) * 10000000;
			int n = Integer.parseInt(br.readLine());
			/*
			 * if (n == 0) { System.out.println("danger"); continue; }
			 */
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			// System.out.println(Arrays.toString(arr));
			int left = 0;
			int right = arr.length - 1;
			int max = -1;
			int sum = 0;
			// int[] tmp = new int[2];

			while (left < right) {
				sum = arr[left] + arr[right];
				if (sum == x) {
					if (Math.abs(arr[left] - arr[right]) > max) {
						max = Math.abs(arr[left] - arr[right]);
						System.out.printf("yes %d %d\n", arr[left], arr[right]);
//						tmp[0] = arr[left];
//						tmp[1] = arr[right];
					}
					break;
				} else if (sum < x) {
					left++;
				} else if (sum > x) {
					right--;
				}
			}

			if (max == -1 || n == 1) {
				System.out.println("danger");
			}
//			else
//				System.out.printf("yes %d %d\n", tmp[0], tmp[1]);

		}
	}
}