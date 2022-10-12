
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s);
            while(st.hasMoreTokens()) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
//        System.out.println(Arrays.toString(pq.toArray()));
        for (int i = 0; i < n-1; i++) {
            pq.poll();
//            System.out.println(pq.poll());
//            System.out.println(Arrays.toString(pq.toArray()));

        }
        System.out.println(pq.poll());
    }
}

