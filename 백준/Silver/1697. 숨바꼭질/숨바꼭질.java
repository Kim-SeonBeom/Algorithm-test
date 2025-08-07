import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] map;
	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int time = 0;

		map = new int[Math.max(n, k) + 3];
		map[n] = 1;
		queue.add(n);
		if (n < k) {
			while (map[k] == 0) {
				for (int i = 0; i < map.length; i++) {

					if (time != 0 && time == map[i]) {
						queue.add(i);
					}
				}
				time++;
				move(time);

//			
//			System.out.println(Arrays.toString(map));
			}
			System.out.println(time);
		}else {
			System.out.println(n-k);
		}

	}

	public static void move(int time) {
		int cur = -1;
		while (!queue.isEmpty()) {
			cur = queue.poll();
			if (cur - 1 >= 0 && map[cur - 1] == 0) {
				map[cur - 1] = time;
			}
			if (cur + 1 < map.length - 1 && map[cur + 1] == 0) {
				map[cur + 1] = time;
			}
			if (cur * 2 < map.length - 1 && map[cur * 2] == 0) {
				map[cur * 2] = time;
			}
		}
	}

}
