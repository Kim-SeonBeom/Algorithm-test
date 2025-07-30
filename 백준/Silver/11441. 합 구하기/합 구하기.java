

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

		int m = Integer.parseInt(br.readLine());
		
		for (int a = 1; a <= m; a++) {
			String[] range = br.readLine().split(" ");

			int i = Integer.parseInt(range[0])-1;
			int j = Integer.parseInt(range[1])-1;
			int sum = 0;
			
			for (int b = i; b <= j; b++) {
				sum += arr[b];
			}
			sb.append(sum);
			sb.append("\n");

		}
		System.out.println(sb.toString());

	}

}
