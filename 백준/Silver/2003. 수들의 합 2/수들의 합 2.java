import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(left < n){
            if(sum > m || right == n){
                sum -=a[left++];
            }else sum += a[right++];

            if(sum ==m) cnt++;

        }
        System.out.println(cnt);
    }

}




