
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			map[i] = br.readLine().chars().map(c -> c - '0').toArray();
		}
		boolean[][] visit = new boolean[n][n];
		int[][] move = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
		Stack<int[]> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();
		int cnt = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				cnt = 0;
				if (map[a][b] != 0 && visit[a][b] == false) {
					stack.push(new int[] { a, b });
				}
				while (!stack.isEmpty()) {
					int[] cur = stack.pop();
					int x = cur[0];
					int y = cur[1];
					if (visit[x][y] == false) {
						visit[x][y] = true;
						cnt++;
					}
					for (int i = 0; i < 4; i++) {
						int nx = x + move[i][0];
						int ny = y + move[i][1];
						if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1) {
							stack.add(new int[] { nx, ny });
							map[nx][ny] = map[x][y] + 1;
						}
					}
				}
				if (cnt != 0) {
					result.add(cnt);
				}

			}
		}
		System.out.println(result.size());
		Collections.sort(result);
		for(int item : result) {
			System.out.println(item);
		}


	}
}