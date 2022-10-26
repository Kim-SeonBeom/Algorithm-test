import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int div = 0;
        while (left < n) {
            div = arr[right] - arr[left];
            if(div < m && right ==n-1){break;}
            if(div >= m){
                min = Math.min(min , div);
                left++;
            }else {
                right++;
                right = Math.min(right, n-1);
            }
        }
        System.out.println(min);

    }
}