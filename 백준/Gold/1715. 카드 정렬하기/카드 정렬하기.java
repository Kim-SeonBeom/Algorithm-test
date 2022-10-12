import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            pq.add(t);
        }
        for (int i = 0; i < n - 1; i++) {
            int x = pq.poll() + pq.poll();
            pq.add(x);
            sum += x;
        }
        System.out.println(sum);

    }
}