
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] card = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < card.length-2; i++) {
			for (int j = i + 1; j < card.length-1; j++) {
				for (int k = j + 1; k < card.length; k++) {
					int sum = 0;
					sum += card[i] + card[j] + card[k];
					if (sum <= m) {
						max = Math.max(max, sum);
					}
				}

			}

		}
		System.out.println(max);
	}
}
