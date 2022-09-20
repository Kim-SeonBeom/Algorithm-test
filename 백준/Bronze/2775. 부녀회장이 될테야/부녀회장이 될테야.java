import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] apt = new int[15][15];
            for (int i = 0; i < apt.length; i++) {
                apt[0][i] = i;
                apt[i][0] = 0;
            }
            for (int i = 0; i < apt.length; i++) {
                for (int j = 0; j < apt[0].length; j++) {
                    if (j == 0) {
                        apt[i][j] = 0;
                    }
                }
            }
            for (int i = 1; i < apt.length; i++) {
                for (int j = 1; j < apt[0].length; j++) {
                    for (int k = 0; k <= j; k++) {
                        apt[i][j] += apt[i - 1][k];
                    }
                }

            }

            System.out.println(apt[a][b]);
        }
    }
}