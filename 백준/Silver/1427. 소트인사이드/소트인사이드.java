import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int b = N;
        int num = 0;

        ///자리수
        while (b > 0) {
            b = b / 10;
            num++;
        }

        /// 자리수 하나씩 넣기
        int[] N_arr = new int[num];
        for (int i = 0; i < N_arr.length; i++) {
            N_arr[i] = N%10;
            N /= 10;
        }
        Arrays.sort(N_arr);
        for (int i = 0; i < N_arr.length; i++) {
            sb.append(N_arr[i]);
        }
        String output = sb.reverse().toString();
        System.out.println(output);

    }
}