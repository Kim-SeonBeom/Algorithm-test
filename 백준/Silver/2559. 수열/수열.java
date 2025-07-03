
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		int[] sumArr = new int[n - k + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i= 0 ; i<sumArr.length; i++) {
			for(int j = i; j<i+k; j++) {
				sumArr[i] +=arr[j];
			}
			max = Math.max(sumArr[i], max);
		}
		System.out.println(max);
		sc.close();

	}
}