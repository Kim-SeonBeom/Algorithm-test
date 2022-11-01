import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;


public class Main {
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] numbers;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        numbers = new int[n];

        Arrays.sort(arr);
        visited = new boolean[n];
        dfs(0);

        System.out.println(sb.toString());
    }

    public static void dfs(int depth) {

        if (depth == m) {
            for (int t : numbers) {
                if (t == 0) break;
                sb.append(t).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i <n; i++)  {
            if(!visited[i]) {
                visited[i] = true;
                numbers[depth] = arr[i];
                dfs(depth + 1);
                visited[i]=false;
            }
        }

    }
}


