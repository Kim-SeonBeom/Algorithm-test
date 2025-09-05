

import java.util.Scanner;

public class Main {
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] map = new int[n];

		Backtrack(n, 0, map);

		System.out.println(answer);
	}

	static boolean check(int[] map, int rowIndex) {
		for (int i = 0; i < rowIndex; i++) {
			if (map[i] == map[rowIndex])
				return false;
			if (Math.abs(map[i] - map[rowIndex]) == Math.abs(i - rowIndex))
				return false;
		}

		return true;
	}

	static void Backtrack(int n, int rowIndex, int[] map) {
		if (n == rowIndex) {
			answer++;
		} else {
			for (int i = 0; i < n; i++) {
				map[rowIndex] = i;
				if (check(map, rowIndex))
					Backtrack(n, rowIndex + 1, map);
			}
		}
	}
}
