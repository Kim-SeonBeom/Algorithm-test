
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long[] nums = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long x = nums[0];
		long y = nums[1];
		long w = nums[2];
		long s = nums[3];
		
		long result = 0;
		if (2 * w < s) {
			result = (x + y) * w;
		} else if (2 * w > 2 * s) {
			if ((x + y) % 2 == 0) {
				result = Math.max(x, y) * s;
			} else {
				result = (Math.max(x, y) - 1) * s;
				result += w;
			}
		} else {
			if (x == y) {
				result = s * x;
			} else {
				result = Math.min(x * s, y * s);
				result += Math.abs(x - y) * w;
			}
		}
		System.out.println(result);
	}
}