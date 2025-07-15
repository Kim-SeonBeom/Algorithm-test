import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();
		int[][] pascal = new int[r + w - 1][];

		for (int i = 0; i < r + w - 1; i++) {
			pascal[i] = new int[i + 1];
			for (int j = 0; j < i + 1; j++) {
				if (i == 0 || j == 0 || j == i) {
					pascal[i][j] = 1;
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				}
			}
		}
//		for (int[] item : pascal) {
//			System.out.println(Arrays.toString(item));
//		}

		int sum = 0;
		int cnt = 1;
		for (int i = r - 1; i < r + w - 1; i++) {
			for (int j = c - 1; j < c + cnt - 1; j++) {
//				System.out.println(pascal[i][j]);
				sum += pascal[i][j];
			}
			cnt++;
		}
		System.out.println(sum);
		sc.close();

	}

}
