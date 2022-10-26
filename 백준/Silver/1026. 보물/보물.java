import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq1.add(Integer.parseInt(st.nextToken()));
        }
        s = br.readLine();
        st = new StringTokenizer(s);
        for (int i = 0; i < n; i++) {
            pq2.add(Integer.parseInt(st.nextToken()));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pq1.poll() * pq2.poll();
        }
        System.out.println(sum);


//        System.out.println(Arrays.toString(arr));
//        int left = 0;
//        int right = 0;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        int result_l = 0;


    }

}