

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] tmp = new int[2];
		int min = Integer.MAX_VALUE;
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int result = arr[left] + arr[right];
			if (result == 0) {
				min = Math.abs(result);
				tmp[0] = arr[left];
				tmp[1] = arr[right];
				break;
			} else if (result < 0) {

				if (Math.abs(result) <= min) {
					min = Math.abs(result);
					tmp[0] = arr[left];
					tmp[1] = arr[right];
				}
				left++;
			} else {

				if (Math.abs(result) <= min) {
					min = Math.abs(result);
					tmp[0] = arr[left];
					tmp[1] = arr[right];
				}
				right--;
			}
		}
		if (tmp[0] > tmp[1]) {
			left = tmp[0];
			tmp[0] = tmp[1];
			tmp[1] = left;
		}
		System.out.println(tmp[0] + " " + tmp[1]);
	}
}
