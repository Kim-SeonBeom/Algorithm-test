import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stringDef = br.readLine().split(" ");

		int n = Integer.parseInt(stringDef[0]);
		long b = Long.parseLong(stringDef[1]);

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		int[][] result = divide(arr, b);

		for (int[] item : result) {
			for (int ele : item) {
				System.out.print(ele % 1000 + " ");
			}
			System.out.println();
		}


	}

	static int[][] divide(int[][] arr, long b) {
		if (b == 1) {
			return arr;
		}
		int[][] result = divide(arr, b / 2);
		result = arrMultiple(result, result);
		if (b % 2 == 1) {
			result = arrMultiple(result, arr);
		}
		return result;

	}

	static int[][] arrMultiple(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				for (int k = 0; k < arr1.length; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
					result[i][j] %= 1000;
				}
			}

		}
		return result;
	}

}
