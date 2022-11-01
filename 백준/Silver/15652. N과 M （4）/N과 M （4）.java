
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        dfs(0,1);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth, int a) {

        if (depth == m) {
            for (int t : arr) {
                if (t == 0) break;
                sb.append(t).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = a; i <=n; i++)  {
            arr[depth] = i;
            dfs(depth + 1, i);


        }
    }
}


