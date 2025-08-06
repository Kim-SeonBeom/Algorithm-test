
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine()); //time 회 시행
		
		for (int t = 0; t < time; t++) {
			int cnt = 0;
			String[] info = br.readLine().split(" "); // t번째 정보
			int[][] map = new int[Integer.parseInt(info[0])][Integer.parseInt(info[1])];
			for (int i = 0; i < Integer.parseInt(info[2]); i++) { //배추위치들
				String[] data = br.readLine().split(" ");
				int row = Integer.parseInt(data[0]);
				int col = Integer.parseInt(data[1]);
				map[row][col] = 1;
			}


			int[][] move = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
			
			Stack<int[]> stack = new Stack<>();
			for (int a = 0; a < Integer.parseInt(info[0]); a++) {
				for (int b = 0; b < Integer.parseInt(info[1]); b++) {
					boolean flag = false;
					if (map[a][b] == 1 ) {
						stack.push(new int[] { a, b });
						cnt++;
					}
					while (!stack.isEmpty()) {
						int[] cur = stack.pop();
						int x = cur[0];
						int y = cur[1];
						map[x][y] = 0;
						for (int i = 0; i < 4; i++) {
							int nx = x + move[i][0];
							int ny = y + move[i][1];
							if (nx >= 0 && ny >= 0 && nx < Integer.parseInt(info[0]) && ny < Integer.parseInt(info[1])
									&& map[nx][ny] == 1) {
								stack.add(new int[] { nx, ny });
							}
						}
					}
			
				}
			}
			System.out.println(cnt);

		}

	}
}
