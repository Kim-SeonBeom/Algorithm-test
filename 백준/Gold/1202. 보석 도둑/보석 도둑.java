
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] jewel = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			jewel[i][0] = Integer.parseInt(st.nextToken());
			jewel[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] bag = new int[m];

		for (int i = 0; i < m; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bag);
		Arrays.sort(jewel, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		long price = 0;
		int idx = 0;
		for (int i = 0; i < bag.length; i++) {
			while (true) {
				if (idx >= n || bag[i] < jewel[idx][0]) {
					break;
				}
				pq.add(jewel[idx][1]);
				idx++;

			}
			if (pq.size() > 0) {
				price += pq.poll();
			}

		}

		System.out.println(price);
	}
}
