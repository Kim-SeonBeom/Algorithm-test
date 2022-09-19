import java.io.StringReader;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int primeSum = 0;

        int cnt = 0;
        for (int i = m; i <=n; i++) {
            if (i < 2) {
                continue;
            }
            if (i == 2) {
                primeSum+=i;
                primes.add(i);
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                primeSum += i;
                primes.add(i);
            }
            cnt = 0;
        }
        if(primeSum == 0 || primes.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(primeSum);
            System.out.println(primes.get(0));
        }
    }
}