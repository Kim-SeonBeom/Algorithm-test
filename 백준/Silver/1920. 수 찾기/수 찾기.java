import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] n_arr;
    static int m;
    static int[] m_arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        n_arr = new int[n];
        for (int i = 0; i < n; i++) {
            n_arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n_arr);
        s = br.readLine();
        m = Integer.parseInt(s);
        s = br.readLine();
        st = new StringTokenizer(s);
        m_arr = new int[m];
        for (int i = 0; i < m; i++) {
            m_arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int key = m_arr[i];
            boolean flag = false;
            int start = 0;
            int mid = 0;
            int end = n_arr.length;
            while (start < end) {
                mid = (start + end - 1) / 2;
                if (key == n_arr[mid]) {
                    flag = true;
                    break;
                } else {
                    if (key < n_arr[mid]) {
                        end = mid;
                    } else if (key > n_arr[mid]) {
                        start = mid + 1;
                    }
                }
            }
            if (flag) {
                System.out.println(1);
            } else System.out.println(0);


        }
    }
}
