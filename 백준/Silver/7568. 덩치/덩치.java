//7568
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] size = new int[n][3];
		for (int i = 0; i < n; i++) {
			size[i][0] = sc.nextInt();
			size[i][1] = sc.nextInt();
			size[i][2] = 1;
		}
		for (int i = 0; i < size.length; i++) {
			for (int j = 0; j < size.length; j++) {
				if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					size[i][2]++;
				}
			}
		}
		for(int[] item : size) {
			System.out.print(item[2] +" ");
		}
		sc.close();

	}

}
