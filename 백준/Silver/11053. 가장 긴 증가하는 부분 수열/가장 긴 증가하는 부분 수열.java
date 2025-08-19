
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int[] dp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.fill(dp, 1);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		System.out.println(Arrays.stream(dp).max().getAsInt());

	}

}