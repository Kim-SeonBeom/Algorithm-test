import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 0; i < n + 1; i++) {
			Collections.sort(graph.get(i),Collections.reverseOrder());
			// Collections.reverse(graph.get(i));
		//	System.out.println(graph.get(i).toString());

		}
		///////////////
		boolean[] visitDfs = new boolean[n + 1];
		visitDfs[0] = true;
		Stack<Integer> dfs = new Stack<>();
		dfs.add(k);
		while (!dfs.isEmpty()) {
			int node = dfs.pop();
			if (!visitDfs[node]) {
				visitDfs[node] = true;
				System.out.print(node + " ");
			}
			for (int next : graph.get(node)) {
				if (visitDfs[next])
					continue;
				dfs.add(next);
			}
		}
		System.out.println();
		///////////////
		
		boolean[] visitBfs = new boolean[n + 1];
		visitBfs[0] = true;
		Queue<Integer> bfs = new LinkedList<>();

		for (int i = 0; i < n + 1; i++) {
			Collections.sort(graph.get(i));
		//	System.out.println(graph.get(i).toString());

		}
		bfs.add(k);
		while (!bfs.isEmpty()) {
			int node = bfs.poll();
			if (!visitBfs[node]) {
				visitBfs[node] = true;
				System.out.print(node + " ");
			}
			for (int next : graph.get(node)) {
				if (visitBfs[next]) {
					continue;
				}
				bfs.add(next);
			}
		}
		sc.close();

	}

}