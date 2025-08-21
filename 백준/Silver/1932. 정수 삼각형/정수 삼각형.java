
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] tri = new int[n][n];
		for(int i = 0; i<n;i++) {
			tri[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			//System.out.println(Arrays.toString(tri[i]));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				if (i == 0) {
					tri[i][j] = tri[i][j];
				} else {
					if (j == 0) {
						tri[i][j] = tri[i - 1][0] + tri[i][j];
					} else if (j == tri[i].length - 1) {
						tri[i][j] = tri[i - 1][tri[i - 1].length - 1] + tri[i][j];
					} else {
						tri[i][j] = Math.max(tri[i - 1][j - 1], tri[i - 1][j]) + tri[i][j];
					}
				}
			}
		}

		int result = 0;
		for (int i = 0; i < tri[n - 1].length; i++) {
			//System.out.println(tri[n-1][i]);
			result = Math.max(tri[n-1][i], result);
		}
		System.out.println(result);

	}

}
