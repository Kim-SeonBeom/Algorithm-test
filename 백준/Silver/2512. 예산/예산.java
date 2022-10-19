import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] n_arr;
    static int m;

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
        
        m = Integer.parseInt(br.readLine());
        int sum = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n_arr.length; i++) {
            right = Math.max(right, n_arr[i]);
            
        }
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            sum = 0;
            //       System.out.println("mid = " + mid);
            //       System.out.println("right = " + right);
            //       System.out.println("left = " + left);
            for (int i = 0; i < n_arr.length; i++) {
                if (n_arr[i] < mid) {
                    sum += n_arr[i];
                } else sum += mid;
            }
            //       System.out.println("sum = " + sum);
            if (sum > m) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
            //         System.out.println();
        }
        //    System.out.println("mid = " + mid);
        //    System.out.println("right = " + right);
        //    System.out.println("left = " + left);
        System.out.println(right);


    }
}