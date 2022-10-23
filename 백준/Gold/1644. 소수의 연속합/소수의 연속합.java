import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int[] a = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = Integer.parseInt(st.nextToken());
//        }
        int n = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for(int i = 0; i < prime.length; i++) {
            if(!prime[i]){a.add(i);}
        }
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (left < a.size()) {
            if (sum > n || right == a.size()) {
                sum -= a.get(left++);
            } else sum += a.get(right++);

            if (sum == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}

