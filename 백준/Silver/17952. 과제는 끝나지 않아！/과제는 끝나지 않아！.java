import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
        	int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if(tmp[0]==1) {
            	stack.push(new int[] {tmp[1],tmp[2]});
            }

            if(!stack.isEmpty()) {
                int[] task = stack.peek();
                task[1]--;

                if(task[1] == 0) {
                    result += task[0];
                    stack.pop();
                }
            }
        }

        System.out.println(result);
    }
}