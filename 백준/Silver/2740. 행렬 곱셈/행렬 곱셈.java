
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = tmp[0];
		int m = tmp[1];

		int[][] arr1 = new int[n][m];
		for (int i = 0; i < n; i++) {
			tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < m; j++) {
				arr1[i][j] = tmp[j];
			}
		}

		tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		m = tmp[0];
		int k = tmp[1];
		int[][] arr2 = new int[m][k];

		for (int i = 0; i < m; i++) {
			tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < k; j++) {
				arr2[i][j] = tmp[j];
			}
		}

		int[][] result = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				for (int l = 0; l < m; l++) {
					result[i][j] += arr1[i][l] * arr2[l][j];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				bw.write(result[i][j] + " ");
			}
			bw.newLine();
		}
		bw.flush();
	}

}