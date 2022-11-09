import java.util.Scanner;

public class Main {
    static int n;
    static int[] d;
    static int t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            d = new int[n + 3];
            System.out.println(plus123(n));
        }
    }

    public static int plus123(int n) {
        d[0] = 0;
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }
        return d[n];
    }

}