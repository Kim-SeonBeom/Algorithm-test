import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int max  = Integer.MIN_VALUE;
        int weight = 0;
        for (int i = 0; i < n; i++) {
            weight = arr[i]*(i+1);
            max = Math.max(max, weight);
        }
        System.out.println(max);
    }

}


