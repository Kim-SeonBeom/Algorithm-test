import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); //

        Deque<Integer> deque  = new LinkedList<>(); // 1~N까지 deque에 add;
        for(int i = 1 ; i <= N ; i++){
            deque.add(i);
        }
        int count = 0;                              //카운트
        while(deque.size() > 0){
            if(count%(M*2)<M){
                for (int j = 0; j < K-1; j++) {
                    deque.add(deque.poll());
                }
                bw.write(String.valueOf(deque.poll()));
                bw.newLine();
                count++;
            }else if(count%(M*2)>=M){
                for (int j = 0; j < K-1; j++) {
                    deque.addFirst(deque.pollLast());
                }
                bw.write(String.valueOf(deque.pollLast()));
                bw.newLine();
                count++;
            }
        }
        bw.close();
    }
}
