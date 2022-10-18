import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static int n;
    public static int[] arr;
    public static int m;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            arr[i] = Integer.parseInt(s);
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int item : arr) {
            max = Math.max(max, item);
        }

        long left = 1;
        long right = max;
        long cnt = 0;
        long mid = 0;
        while (left <= right) {
            cnt = 0;
            mid = (left + right) / 2;
            for (int i = 0; i < n; i++) {
                cnt += arr[i] / mid;
            }
            if (cnt > m-1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(right);
    }
}