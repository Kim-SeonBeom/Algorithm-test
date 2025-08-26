
import java.util.Scanner;

public class Main {
	static int r, c;
	static int cnt = 0;
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();

		int size = (int) Math.pow(2, n);
		search(0, 0, size);
	}

	public static void search(int row, int col, int size) {
		if (flag)
			return;

		if (size == 1) {
			if (row == r && col == c) {
				System.out.println(cnt);
				flag = true;
			}
			cnt++;
			return;
		}

		int half = size / 2;


		if (r < row + half && c < col + half) {
			search(row, col, half);
		} else {
			cnt += half * half;
		}


		if (r < row + half && c >= col + half) {
			search(row, col + half, half);
		} else {
			cnt += half * half;
		}


		if (r >= row + half && c < col + half) {
			search(row + half, col, half);
		} else {
			cnt += half * half;
		}

	
		if (r >= row + half && c >= col + half) {
			search(row + half, col + half, half);
		} else {
			cnt += half * half;
		}
	}
}
