import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			if (arr[0] == 0 && arr[1] == 0) {
				break;
			}
			arr[1] = arr[1] < arr[0] - arr[1]   ? arr[1] : arr[0] - arr[1];
			sb.append(Combination(arr[0], arr[1]));
			sb.append("\n");

		}
		System.out.println(sb.toString());

	}

	static long Combination(int n, int m) {
		n++;
		long result = 1;

		for (int i = 1; i <= m; i++) {
			result *= n - i;
			result /= i;

		}

		/*
		 * System.out.println(Arrays.toString(c));
		 * System.out.println(Arrays.toString(p));
		 */

//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < m; j++) {
//				if (c[i] % p[j] == 0) {
//					c[i] /= p[j];
//					p[j] = 1;
//				}
//			}
//		}
		/*
		 * System.out.println(Arrays.toString(c));
		 * System.out.println(Arrays.toString(p));
		 */
//		for (int i = 0; i < m; i++) {
//			cResult *= c[i];
//			pResult *= p[i];
//
//		}

		return result;
	}
}
