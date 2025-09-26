
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static char[][] graph;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		graph = new char[n][n];

		for (int i = 0; i < n; i++) {
			graph[i] = br.readLine().toCharArray();
		}
		int[] head = findHead(n);

		int[] heart = new int[] { head[0] + 1, head[1] };
		System.out.println((heart[0] + 1) + " " + (heart[1] + 1));

		int lefthand = size(heart, "left");
		System.out.print(lefthand +" ");

		int righthand = size(heart, "right");
		System.out.print(righthand+" ");
		
		int waist = size(heart,"");
		System.out.print(waist+" ");
		heart[0] =heart[0]+ waist;
		heart[1]--;
		
		int leftleg = size(heart,"");
		System.out.print(leftleg+" ");
		
		heart[1]+=2;
		int rightleg = size(heart,"");
		System.out.print(rightleg);

	}

	public static int[] findHead(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == '*') {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { 0, 0 };
	}

	public static int size(int[] start, String direction) {
		int size = 0;
		switch (direction) {
		case "left":
			for (int i = start[1] - 1; i >= 0; i--) {
				if (graph[start[0]][i] == '*') {
					size++;
				} else
					break;
			}
			break;
		case "right":
			for (int i = start[1] + 1; i < graph.length; i++) {
				if (graph[start[0]][i] == '*') {
					size++;
				} else
					break;
			}
			break;
		default:
			for (int i = start[0] + 1; i < graph.length; i++) {
				if (graph[i][start[1]] == '*') {
					size++;
				} else
					break;
			}

		}

		return size;
	}
}