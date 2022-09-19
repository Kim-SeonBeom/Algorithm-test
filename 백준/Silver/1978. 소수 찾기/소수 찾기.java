import java.io.StringReader;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int prime= 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if (arr[i] < 2) {
                continue;
            }
            if (arr[i] == 2) {
                prime++;
                continue;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                prime++;
            }
            cnt = 0;

        }
        System.out.println(prime);
    }
}