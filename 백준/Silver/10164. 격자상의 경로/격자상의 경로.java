import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] road = new int[n][m];

		int row = 0;
		int col = 0;

		if (k == 0) {
			row = n - 1;
			col = m - 1;
		} else {
			if (k % m == 0) {
				row = (k / m) - 1;
				col = m - 1;
			} else {
				row = k / m;
				col = (k % m) - 1;

			}
		}
//		System.out.println("n = " + n);
//		System.out.println("m = " + m);
//
//		System.out.println("row = " + row);
//		System.out.println("col = " + col);
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				if (i == 0 || j == 0) {
					road[i][j] = 1;
				} else {
					road[i][j] = road[i - 1][j] + road[i][j - 1];
				}
			}
//			System.out.println(Arrays.toString(road[i]));
		}
//		System.out.println("===========");
		for (int i = row; i < n; i++) {
			for (int j = col; j < m; j++) {
				if (i == row || j == col) {
					road[i][j] = road[row][col];
				} else {
					road[i][j] = road[i - 1][j] + road[i][j - 1];
				}
			}
		}

//		for (int[] aa : road) {
//			System.out.println(Arrays.toString(aa));
//		}
		sc.close();
		System.out.println(road[n-1][m-1]);
	}
}
