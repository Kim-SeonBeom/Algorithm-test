
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] size = br.readLine().split(" ");
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			map[i] = br.readLine().chars().map(c -> c - '0').toArray();
		}
//		for (int[] item : map) {
//			System.out.println(Arrays.toString(item));
//		}
		int[][] move = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
		Queue<int[]> q = new LinkedList();
		q.add(new int[] { 0, 0 });
		map[0][0]=2;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + move[i][0];
				int ny = y + move[i][1];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] == 1) {
					q.add(new int[] { nx, ny });
					map[nx][ny] = map[x][y] + 1;
				}
			}
		}
//		System.out.println();
//		for (int[] item : map) {
//			System.out.println(Arrays.toString(item));
//		}
		System.out.println(map[n-1][m-1]-1);

	}
}
