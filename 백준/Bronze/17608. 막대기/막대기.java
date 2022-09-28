import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      Stack<Integer> stack = new Stack<>();
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>();
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
          stack.push(sc.nextInt());
      }
      int[] arr = new int[stack.size()];
      for (int i = 0; i < arr.length; i++){
          arr[i] = stack.pop();
      }
      int max = arr[0];
      int cnt = 1;
      for (int i = 0; i < arr.length; i++){
          if(max<arr[i]){
              max = arr[i];
              cnt++;
          }
      }
        System.out.println(cnt);




    }

}