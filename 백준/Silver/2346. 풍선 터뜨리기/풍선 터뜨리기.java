import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<int[]> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			int[] tmp = new int[2];
			tmp[0] = i+1;
			tmp[1] = sc.nextInt();
			dq.add(tmp);
		}
		int[] tmp = dq.poll();
		System.out.print(tmp[0] +" ");
		int num = tmp[1];
		
		// 돌리기 시작
		while (true) {
			if (dq.size() == 0) {
				break;
			}
			if (num > 0) {
				for (int i = 0; i < num - 1; i++) {
					dq.addLast(dq.pollFirst());
				}
			} else {
				for (int i = 0; i < Math.abs(num); i++) {
					dq.addFirst(dq.pollLast());
				}
			}
			tmp = dq.poll();
			num = tmp[1];
			System.out.print(tmp[0]+" ");

		}
	}
}