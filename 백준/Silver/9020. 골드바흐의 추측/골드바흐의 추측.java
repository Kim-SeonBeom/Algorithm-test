import java.io.StringReader;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            int p  = sc.nextInt();
            for (int i = 1; i <= p; i++) {
                if (i < 2) {
                    continue;
                }
                if (i == 2) {
                    prime.add(i);
                    continue;
                }
                for (int k = 2; k < Math.sqrt((double) i) + 1; k++) {
                    if (i % k == 0) {
                        cnt++;
                        if (cnt > 0) {
                            break;
                        }
                    }
                }
                if (cnt == 0) {
                    prime.add(i);
                }
                cnt = 0;
            }
//            System.out.println(Arrays.toString(prime.toArray()));
            int a = 0;
            int b = 0;
            for (int i = 0; i < prime.size(); i++) {
                for (int k = 0; k < prime.size(); k++) {
                    if (prime.get(i) + prime.get(k) == p && prime.get(i)<= prime.get(k)) {
                        a = prime.get(i);
                        b = prime.get(k);
                    }
                }
            }
            System.out.println(a + " " + b);
            prime.clear();
        }
    }
}


