import java.io.StringReader;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = m; i <= n; i++) {
            if (i < 2) {
                continue;
            }
            if (i == 2) {
                sb.append(i);
                sb.append(" ");
                continue;
            }
            for (int j = 2; j < Math.sqrt((double)i)+1; j++) {
                if (i % j == 0) {
                    cnt++;
                    if(cnt>0){break;}
                }
            }
            if (cnt == 0) {
                sb.append(i);
                sb.append(" ");

            }
            cnt = 0;
        }
        for (String item : sb.toString().split(" ")) {
            System.out.println(item);
        }
    }
}
