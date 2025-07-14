
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] visited = new boolean[n + 1];
		visited[0] = true;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		int m = sc.nextInt();
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int node = sc.nextInt();
			int edge = sc.nextInt();
			graph.get(node).add(edge);
			graph.get(edge).add(node);
		}
//		for (ArrayList a : graph) {
//			System.out.println(a.toString());
//		}
		Stack<Integer> dfs = new Stack<Integer>();
		dfs.add(1);
		int cnt = 0;
		while (!dfs.isEmpty()) {
			int node = dfs.pop();
			if (!visited[node]) {
				visited[node] = true;
//				System.out.println(node + " ");
				cnt++;
			}
			for (int next : graph.get(node)) {
				if (visited[next])
					continue;
				dfs.add(next);
			}
		}
		System.out.println(cnt-1);
		

	}
}