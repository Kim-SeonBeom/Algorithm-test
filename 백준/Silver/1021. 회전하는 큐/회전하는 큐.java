import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
//        System.out.println(N);
//        System.out.println(M);
        String ss = br.readLine();
        StringTokenizer st2 = new StringTokenizer(ss);
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
//        System.out.println(Arrays.toString(arr));
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
//        System.out.println(Arrays.toString(deque.toArray()));
        int idx = 0;
        int l_cnt = 0;
        int cnt = 0;
        while (idx < M) {
//            System.out.println(Arrays.toString(deque.toArray()));
//            System.out.println("--------------");

            while(true) {
                if (arr[idx] == deque.getFirst()) {
                    int x = Math.min(l_cnt, deque.size()-l_cnt);
                    deque.removeFirst();
//                    System.out.println("x = " + x);
                    cnt += x;
                    l_cnt = 0;
//                    System.out.println("cnt = " + cnt);
//                    System.out.println("--------------");
                    break;
                } else {
                    leftMove(deque);
//                    System.out.println(Arrays.toString(deque.toArray()));
//                    System.out.println("num = " + deque.getFirst());
                    l_cnt++;
//                    System.out.println("l_cnt = " + l_cnt);
//                    System.out.println("--------------");
                }
            }
            idx++;
        }
        System.out.println(cnt);
//    public static Deque<Integer> makeDeque(int n) {
//        Deque<Integer> deque = new LinkedList<>();
//        for (int i = 1; i < n; i++) {
//            deque.add(i);
//        }
//        return deque;
//    }
    }

    public static void leftMove(Deque<Integer> deque) {
        deque.add(deque.pollFirst());
    }


}


