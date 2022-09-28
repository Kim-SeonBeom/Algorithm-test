import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      int max = arr[arr.length - 1];
      int cnt = 1;
      for (int i = arr.length-1; i >= 0; i--){
          if(max<arr[i]){
              max = arr[i];
              cnt++;
          }
      }
        System.out.println(cnt);
    }

}