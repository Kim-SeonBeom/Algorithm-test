import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while (true) {
			if (q.size() == 1) {
				System.out.println(q.poll());
				break;
			}
			System.out.print(q.poll() + " ");
			q.add(q.poll());
		}
		sc.close();
	}

}
