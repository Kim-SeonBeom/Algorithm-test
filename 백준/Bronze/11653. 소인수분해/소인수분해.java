import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0)
                if (n % i == 0) {
                    n /= i;
                    System.out.println(i);
                }

        }
//        System.out.println(sb.toString());
    }
}

