
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int row = i;
				int col = j;
				boolean flag = true;

				while (row > 0 || col > 0) {
					if (row % 3 == 1 && col % 3 == 1) {
						flag = false;
						break;
					}
					row /= 3;
					col /= 3;
				}
				sb.append(flag ? "*" : " ");	
			}
			sb.append("\n");

		}
		System.out.println(sb.toString());
	}
}
