import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int Coefficients = sc.nextInt();
			int degree = sc.nextInt();

			sum += Coefficients * degree; // * Math.pow(1, degree - 1)
		}
		System.out.println(sum);
		sc.close();
	}
}