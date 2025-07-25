

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr;
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
		           if(o1[0] == o2[0]){
		                return Integer.compare(o1[1], o2[1]);
		            } else {
		                return Integer.compare(o1[0], o2[0]);
		            }
			};
		});

		for (int i = 0; i < n; i++) {
			arr = new int[2];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			pq.add(arr);

		}
		//System.out.println(pq.size());
		for (int i = 0; i < n; i++) {
			arr = pq.poll();
			System.out.println(arr[0] + " " + arr[1]);
		}

	}
}
