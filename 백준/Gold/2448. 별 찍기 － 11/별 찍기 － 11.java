import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
	static char[][] graph;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		graph = new char[n][2 * n - 1];
		for(int i = 0 ; i < n; 	i++) {
			Arrays.fill(graph[i],' ');
		}
		
		star(0, n-1, n);
		for(char[] item : graph) {
			for(char i : item) {
				sb.append(i);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	static void star(int row, int col, int height) {
		if (height == 3) {
			graph[row][col] = '*';
			graph[row + 1][col + 1] = '*';
			graph[row + 1][col - 1] = '*';
			for (int i = col - 2; i <= col + 2; i++) {
				graph[row + 2][i] = '*';
			}
		} else {
			star(row,col,height/2);
			star(row+height/2,col-height/2,height/2);
			star(row+height/2,col+height/2,height/2);
		}

	}
}
