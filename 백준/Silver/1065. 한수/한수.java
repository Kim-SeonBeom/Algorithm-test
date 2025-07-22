

//1065
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = counter(n);

		int d = 0;
		if (n / 100 == 0)
			cnt = n;

		System.out.println(cnt);
	}

	static int counter(int n) {
		if (n / 100 == 0)
			return n;
		if (n == 1000)
			n--;
		int cnt = 0;
		for(int i = 100; i<=n;i++) {
		int third = i%10;
		int second  = (i/10)%10;
		int first = i/100;
		//System.out.printf("%d,%d,%d\n",first, second, third);
		if(first-second ==second-third) cnt++;
		}

		return cnt+99;

	}
}
