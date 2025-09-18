import java.util.Scanner;

public class Main {
    static int n;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(1, 1);
        dfs(1, 2); 

        System.out.println(cnt);
    }

    static void dfs(int digit, int sum) {
        if (digit == n) {
            if (sum % 3 == 0) cnt++;
            return;
        }

        for (int i = 0; i <= 2; i++) {
            dfs(digit + 1, sum + i);
        }
    }
}
