import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long left = 1;
        long right = (long) n * n;
        int result = 0; 

        while (left <= right) {
            long mid = (left + right) / 2;

            long cnt = 0; 
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(n, (int)(mid / i));
            }

            if (cnt >= k) {
                result = (int) mid; 
                right = mid - 1;  
            } else {
                left = mid + 1;    
            }
        }

        System.out.println(result);
    }
}