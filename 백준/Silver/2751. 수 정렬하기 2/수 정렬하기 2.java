import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            writer.write(it.next()+"");
            writer.newLine();
        }
        writer.flush();
        sc.close();
        writer.close();


    }


}




