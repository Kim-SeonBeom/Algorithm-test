

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int cnt = 0;
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] sorted = arr.clone();
		Arrays.sort(sorted);
		int before = Integer.MIN_VALUE;
		for (int i = 0; i < sorted.length; i++) {
			if (!hm.containsKey(sorted[i])) {
				hm.put(sorted[i], cnt);
				cnt++;
			}

		}
		StringBuilder sb = new StringBuilder();

		for (int item : arr) {
			sb.append(hm.get(item) + " ");
		}
        System.out.println(sb.toString()    );

	}
}