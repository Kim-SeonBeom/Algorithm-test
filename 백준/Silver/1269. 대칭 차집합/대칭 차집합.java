import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + sc.nextInt();
		int cnt = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (!set.add(tmp))
				cnt++;
		}
		System.out.println(set.size() - cnt);

	}

}