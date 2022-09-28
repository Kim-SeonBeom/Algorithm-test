import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Object> josephus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        IntStream.range(1, n +1).forEach(i -> queue.add(i));


        while (queue.size() != 0) {
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            int data  = (int) queue.remove();
            josephus.add(data);
        }

        System.out.print("<");
        for (int i = 0; i < josephus.size()-1; i++) {
            System.out.print(josephus.get(i)+", ");
        }
        System.out.print(josephus.get(josephus.size()-1)+">");


    }

}